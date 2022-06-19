package com.thabo.sokodistrict.repository;


import com.thabo.sokodistrict.domain.LeaveDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaveDetailsRepository extends JpaRepository<LeaveDetails, Long> {
}
