package com.solera.team4.bankappbe.transaction;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    TransactionDb db = new TransactionDb();

    public List<TransactionEntity> getAllTransactions() {
        return db.get();
    }

    public TransactionEntity getSingleTransactions(int id) throws Exception {
        List<TransactionEntity> list = db.get();
        for (TransactionEntity transactionEntity : list) {
            if(transactionEntity.getId() == id){
                return transactionEntity;
            }
        }
        throw new Exception("The transaction with id \"" + id + "\" doesn't exist.");
    }

    public String createTransactions(TransactionEntity transaction) throws Exception {
        List<TransactionEntity> list = db.get();
        for (TransactionEntity transactionEntity : list) {
            if(transactionEntity.getId() == transaction.getId()){
                throw new Exception("The id of the transaction already exists, please check it again before submit!");
            }
        }
        return db.add(transaction);
    }

    public String deleteTransactions(int transactionId) throws Exception {
        List<TransactionEntity> list = db.get();
        for (TransactionEntity transactionEntity : list) {
            if(transactionEntity.getId() == transactionId){
                return db.remove(transactionId);
            }
        }
        throw new Exception("The id of the transaction doesn't exists, please check it again before submit!");
    }
}
