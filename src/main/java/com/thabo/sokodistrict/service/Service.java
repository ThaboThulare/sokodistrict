package com.thabo.sokodistrict.service;

import com.thabo.sokodistrict.domain.EmployeeDetails;
import com.thabo.sokodistrict.model.EmployeeDetailsQueryModel;
import com.thabo.sokodistrict.repository.EmployeeDetailsRepository;
import com.thabo.sokodistrict.repository.LeaveTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.thabo.sokodistrict.mapper.Mapper.toEmployeeDetailsQueryModel;

@RestController
public class Service
{
    private static final Logger log = LoggerFactory.getLogger(Service.class);

    @Autowired
    private LeaveTypeRepository leaveTypeRepository;

    @Autowired
    private EmployeeDetailsRepository employeeDetailsRepository;


    @RequestMapping(value = "api/employee/{employeeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDetailsQueryModel findEmployeeDetails(@PathVariable("employeeId") Long employeeId) {

        log.info("find employee - employeeId:{}", employeeId);
        EmployeeDetails employeeDetails = employeeDetailsRepository.getReferenceById(employeeId);
        log.info(employeeDetails.toString());
        return toEmployeeDetailsQueryModel(employeeDetails);

    }

}
