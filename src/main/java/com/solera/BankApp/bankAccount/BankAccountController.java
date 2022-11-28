package com.solera.BankApp.bankAccount;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping
    @RequestMapping("/{createId}")
    public ResponseEntity<?> getSingleAccount(@PathVariable("createId") int accountId){
        try {
            BankAccount account = bAccountService.getSingleAccount(accountId);
            return new ResponseEntity<BankAccount>(account, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @PostMapping
    public ResponseEntity<String> createBAnkAccount(@RequestBody BankAccount account){
        try {
            String msg = bAccountService.createAccount(account);
            return new ResponseEntity<String>(msg, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping
    @RequestMapping("/delete/{deleteId}")
    public ResponseEntity<String> deleteAccount(@PathVariable("deleteId") int accountId){
        try {
            String msg = bAccountService.deleteAccount(accountId);
            return new ResponseEntity<String>(msg, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

}
