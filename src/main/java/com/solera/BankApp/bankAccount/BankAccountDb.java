package com.solera.BankApp.bankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDb {


    private static List<BankAccount> accounts =new ArrayList<>();

    public String add(BankAccount bankAccount){

        accounts.add(bankAccount);
        return bankAccount.toString();
    }

    public String delete(int id){
        for(BankAccount bankAccount : accounts){
            if(bankAccount.getId() == id){
                accounts.remove(bankAccount);
                return "Deletion sucesfull";
            }
        }
        return "This Account doesn't exists";
    }

    public  List<BankAccount> getAccounts(){
        return accounts;
    }
}
