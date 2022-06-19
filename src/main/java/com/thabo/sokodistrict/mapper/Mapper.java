package com.thabo.sokodistrict.mapper;

import com.thabo.sokodistrict.domain.*;
import com.thabo.sokodistrict.model.*;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public static final String DATE_FORMAT = "dd/MM/yyyy";

    public static EmployeeDetailsQueryModel toEmployeeDetailsQueryModel(EmployeeDetails employeeDetails)
    {
        EmployeeDetailsQueryModel employeeDetailsQueryModel = new EmployeeDetailsQueryModel();
        employeeDetailsQueryModel.setId(employeeDetails.getId());
        employeeDetailsQueryModel.setName(employeeDetails.getName());
        employeeDetailsQueryModel.setLastName(employeeDetails.getLastName());
        return employeeDetailsQueryModel;
    }

    public static List<EmployeeDetailsQueryModel> toEmployeeDetailsQueryModelListList(List<EmployeeDetails> employeeDetailsList)
    {
        List<EmployeeDetailsQueryModel> employeeDetailsQueryModelList = new ArrayList<>();
        employeeDetailsList.forEach(employeeDetails -> employeeDetailsQueryModelList.add(toEmployeeDetailsQueryModel(employeeDetails)));
        return employeeDetailsQueryModelList;
    }

    public static LeaveTypeQueryModel toLeaveTypeQueryModel(LeaveType leaveType)
    {
        LeaveTypeQueryModel leaveTypeQueryModel = new LeaveTypeQueryModel();
        leaveTypeQueryModel.setId(leaveType.getId());
        leaveTypeQueryModel.setType(leaveType.getLeaveType());
        return leaveTypeQueryModel;
    }

    public static List<LeaveTypeQueryModel> toLeaveTypeQueryModelList(List<LeaveType> leaveTypeList)
    {
        List<LeaveTypeQueryModel> leaveTypeQueryModelList = new ArrayList<>();
        leaveTypeList.forEach(leaveType -> leaveTypeQueryModelList.add(toLeaveTypeQueryModel(leaveType)));
        return leaveTypeQueryModelList;
    }

    public static LeaveBalanceQueryModel toLeaveBalanceQueryModel(LeaveBalance leaveBalance)
    {
        LeaveBalanceQueryModel leaveBalanceQueryModel = new LeaveBalanceQueryModel();
        leaveBalanceQueryModel.setId(leaveBalance.getId());
        leaveBalanceQueryModel.setBalance(BigInteger.valueOf(leaveBalance.getBalance()));
        return leaveBalanceQueryModel;
    }

    public static LeaveDetailsQueryModel toLeaveDetailsQueryModel(LeaveDetails leaveDetails)
    {
        LeaveDetailsQueryModel leaveDetailsQueryModel = new LeaveDetailsQueryModel();
        leaveDetailsQueryModel.setId(leaveDetails.getId());
        leaveDetailsQueryModel.setLeaveType(leaveDetails.getLeaveType().getLeaveType());
        return leaveDetailsQueryModel;
    }

    private static List<LeaveDetailsQueryModel> toLeaveDetailsQueryModelList(List<LeaveDetails> leaveDetailsList)
    {
        List<LeaveDetailsQueryModel> leaveDetailsQueryModelList = new ArrayList<>();
        leaveDetailsList.forEach(leaveDetails -> leaveDetailsQueryModelList.add(toLeaveDetailsQueryModel(leaveDetails)));
        return leaveDetailsQueryModelList;
    }

    private static EmployeeLeaveQueryModel toEmployeeLeaveQueryModel(EmployeeLeave employeeLeave)
    {
        EmployeeLeaveQueryModel employeeLeaveQueryModel = new EmployeeLeaveQueryModel();
        employeeLeaveQueryModel.setId(employeeLeave.getId());
        employeeLeaveQueryModel.setStartDate(new SimpleDateFormat(DATE_FORMAT).format(employeeLeave.getStartDate()));
        employeeLeaveQueryModel.setEndDate(new SimpleDateFormat(DATE_FORMAT).format(employeeLeave.getEndDate()));
        return employeeLeaveQueryModel;
    }

    private static List<EmployeeLeaveQueryModel> toEmployeeLeaveQueryModelList(List<EmployeeLeave> employeeLeaveList)
    {
        List<EmployeeLeaveQueryModel> employeeLeaveQueryModelList = new ArrayList<>();
        employeeLeaveList.forEach(employeeLeave -> employeeLeaveQueryModelList.add(toEmployeeLeaveQueryModel(employeeLeave)));
        return employeeLeaveQueryModelList;
    }
}
