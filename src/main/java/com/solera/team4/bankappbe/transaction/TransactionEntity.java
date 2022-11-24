package com.solera.team4.bankappbe.transaction;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class TransactionEntity {
   
    private int id; //Id of the transaction
    private double ammount;
    private TransactionDTO from;
    private TransactionDTO to;
    private LocalDateTime date;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getAmmount() {
        return ammount;
    }
    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
    public TransactionDTO getFrom() {
        return from;
    }
    public void setFrom(TransactionDTO from) {
        this.from = from;
    }
    public TransactionDTO getTo() {
        return to;
    }
    public void setTo(TransactionDTO to) {
        this.to = to;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }  
}
