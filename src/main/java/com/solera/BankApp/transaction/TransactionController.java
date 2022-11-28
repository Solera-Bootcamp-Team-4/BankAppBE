package com.solera.BankApp.transaction;

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
@RequestMapping("/transaction")
public class TransactionController {
    
    @Autowired
    TransactionService transactionService;

    @GetMapping
    public ResponseEntity<?> getAllTransaction(){
         try {
             List<TransactionEntity> transactions = transactionService.getAllTransactions();
             return new ResponseEntity<List<TransactionEntity>>(transactions, HttpStatus.OK);
         } catch (Exception e) {
             return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
         }
     }

     @GetMapping
     @RequestMapping("/{createId}")
     public ResponseEntity<?> getSingleTransaction(@PathVariable("createId") int transactionId){
         try {
             TransactionEntity trans = transactionService.getSingleTransactions(transactionId);
             return new ResponseEntity<TransactionEntity>(trans, HttpStatus.OK);
         } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
         }
     }

     @PostMapping
     //@Transactional
     public ResponseEntity<String> createTransaction(@RequestBody TransactionEntityNoDate transaction){
         try {
             String msg = transactionService.createTransactions(transaction);
             return new ResponseEntity<String>(msg, HttpStatus.OK);
         } catch (Exception e) {
             return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
         }
     }

     @DeleteMapping
     @RequestMapping("/delete/{deleteId}")
     public ResponseEntity<String> deleteTransaction(@PathVariable("deleteId") int transactionId){
         try {
             String msg = transactionService.deleteTransactions(transactionId);
             return new ResponseEntity<String>(msg, HttpStatus.OK);
         } catch (Exception e) {
             return new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
         }
     }

    //Editing a transaction is not wise in my opinion, so I'll not do a PUT Api.
}
