package com.solera.team4.bankappbe.bankAccount;

import org.springframework.stereotype.Component;

@Component
public class BankAccount {
    
    private int id;
    private double balance;
    private String ownerName;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
