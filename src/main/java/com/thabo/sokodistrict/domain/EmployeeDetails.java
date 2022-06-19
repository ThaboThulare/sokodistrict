package com.thabo.sokodistrict.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee_detail")
public class EmployeeDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToOne
    @JoinColumn(name = "leave_balance_id")
    private LeaveBalance leaveBalance;

    @OneToMany(mappedBy = "employeeDetails")
    private List<LeaveDetails> leaveDetails;

    public EmployeeDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LeaveBalance getLeaveBalance() {
        return leaveBalance;
    }

    public void setLeaveBalance(LeaveBalance leaveBalance) {
        this.leaveBalance = leaveBalance;
    }

    public List<LeaveDetails> getLeaveDetails() {
        return leaveDetails;
    }

    public void setLeaveDetails(List<LeaveDetails> leaveDetails) {
        this.leaveDetails = leaveDetails;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", leaveBalance=" + leaveBalance +
                ", leaveDetails=" + leaveDetails +
                '}';
    }
}
