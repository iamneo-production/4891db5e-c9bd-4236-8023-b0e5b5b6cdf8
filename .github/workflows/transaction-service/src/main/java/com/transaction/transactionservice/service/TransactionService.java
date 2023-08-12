package com.transaction.transactionservice.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.transactionservice.dto.TransactionDto;
import com.transaction.transactionservice.model.Transaction;
import com.transaction.transactionservice.repository.TransactionRepository;

@Service
public class TransactionService{

    @Autowired
    private TransactionRepository transactionRepository;

    public void transferAmount (TransactionDto transactionDto){

        LocalDateTime currentDateTime = LocalDateTime.now();

        Transaction transaction = Transaction.builder()
                .sourceAccountNumber(transactionDto.getSourceAccountNumber())
                .destinationAccountNumber(transactionDto.getDestinationAccountNumber())
                .transferAmount(transactionDto.getTransferAmount())
                .transactinDateTime(currentDateTime)
                .transactionStatus(true)
                .build();

        transactionRepository.save(transaction);

    }
}