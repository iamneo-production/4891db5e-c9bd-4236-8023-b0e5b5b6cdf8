package com.hackathon.transaction.transactionservice.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.transaction.transactionservice.dto.TransactionDto;
import com.hackathon.transaction.transactionservice.model.Transaction;
import com.hackathon.transaction.transactionservice.repository.TransactionRepository;


@Service
public class TransactionService{

    @Autowired
    private AuditService auditService;

    @Autowired
    private TransactionRepository transactionRepository;

    Double sourceAccBal = 500000.00;
    Double destinationAccBal = 500000.00;


    public void transferAmount (TransactionDto transactionDto){

        LocalDateTime currentDateTime = LocalDateTime.now();
        deductCreditAccount(transactionDto.getTransferAmount());
        auditService.createAudit(transactionDto);
        Transaction transaction = Transaction.builder()
                .sourceAccountNumber(transactionDto.getSourceAccountNumber())
                .destinationAccountNumber(transactionDto.getDestinationAccountNumber())
                .transferAmount(transactionDto.getTransferAmount())
                .transactinDateTime(currentDateTime)
                .transactionStatus(true)
                .build();

        transactionRepository.save(transaction);


    }

    public void deductCreditAccount(Double transferAmount){
        sourceAccBal=sourceAccBal-transferAmount;
        destinationAccBal=destinationAccBal+transferAmount;
    }


}
