package com.thabo.sokodistrict.domain;

import javax.persistence.*;

@Entity
@Table(name = "leave_type")
public class LeaveType
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "leave_type", nullable = false)
    private String LeaveType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeaveType() {
        return LeaveType;
    }

    public void setLeaveType(String leaveType) {
        LeaveType = leaveType;
    }
}
