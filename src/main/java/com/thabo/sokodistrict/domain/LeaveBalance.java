package com.thabo.sokodistrict.domain;

import javax.persistence.*;

@Entity
@Table(name = "leave_balance")
public class LeaveBalance
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "bonus", nullable = false)
    private int bonus;
    @Column(name = "balance", nullable = false)
    private int balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
