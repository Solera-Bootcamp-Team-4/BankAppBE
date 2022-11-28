package com.solera.BankApp.bankAccount;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {

    //@Autowired
    //A class to read/write on the bank account's file

    BankAccountDb bankAccountDb = new BankAccountDb();

    public List<BankAccount> getAccounts()
    {
        return bankAccountDb.getAccounts();
    }

    public  BankAccount getSingleAccount(int id) throws Exception{
        List<BankAccount> list = bankAccountDb.getAccounts();
        for (BankAccount bankAccount : list){
            if(bankAccount.getId() == id ){
                return bankAccount;
            }
        }
        throw new Exception("Account doesn't exist.");
    }


    public String deleteAccount(int accountId) throws Exception {
        List<BankAccount> accountList = bankAccountDb.getAccounts();
        for (BankAccount bankAccounts : accountList) {
            if (bankAccounts.getId() == accountId) {
               return bankAccountDb.delete(accountId);
            }
        }
        throw  new Exception("Account doesn't exists");
        }



    public String createAccount(BankAccount newAccount) throws Exception{
            List<BankAccount> accountList = bankAccountDb.getAccounts();
            for (BankAccount bankAccounts : accountList)
            {
               if(bankAccounts.getId() == newAccount.getId()){
                   throw  new Exception("Existing Account");
               }

            }
       return bankAccountDb.add(newAccount);
    }

//    public String editAccountName(int accountId, String newName) throws Exception
//    {
//        List<BankAccount> accountList = bankAccountDb.getAccounts();
//        for (BankAccount bankAccount : accountList)
//        {
//            if(bankAccount.getId() == accountId){
//                throw  new Exception("Account doesn't exists");
//            }
//        }
//        BankAccount account = new BankAccount();
//        account.ownerName = newName;
//       return "Name changed";
//    }


}
