package com.solera.BankApp.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionDb {
    
    private static List<TransactionEntity> transactions = new ArrayList<>();

    public String add(TransactionEntity transE){
        transactions.add(transE);
        return "The transaction has been saved.";
    }

    public String remove(int id){
        for (TransactionEntity transactionEntity : transactions) {
            if(transactionEntity.getId() == id){
                transactions.remove(transactionEntity);
                return "The transaction has been deleted!";
            }
        }
        return "An error has occured, we couldn't find the transaction.";
    }

    public List<TransactionEntity> get(){
        return transactions;
    }
}
