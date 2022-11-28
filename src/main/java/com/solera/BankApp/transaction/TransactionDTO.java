package com.solera.BankApp.transaction;

import org.springframework.stereotype.Component;

@Component
public class TransactionDTO {
    
    private int accountId;
    private String ownerName;

    public int getAccountId() {
        return accountId;
    }
    public String getOwnerName() {
        return ownerName;
    }
}
