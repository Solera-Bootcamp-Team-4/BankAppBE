package com.solera.BankApp.bankAccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankaccount")
public class BankAccountController {
    
    @Autowired
    BankAccountService bAccountService;

    @GetMapping
    public ResponseEntity<?> getAccounts(){
        try{
            List<BankAccount> accounts = bAccountService.getAccounts();
            return new ResponseEntity<List<BankAccount>>(accounts, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }
}
