package com.transaction.transactionservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.transactionservice.repository.TransactionRepository;

@Service
public class TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    public void transferAmount(){
        
    }


}