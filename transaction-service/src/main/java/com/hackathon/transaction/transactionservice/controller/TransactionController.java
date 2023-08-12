package com.hackathon.transaction.transactionservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.hackathon.transaction.transactionservice.dto.TransactionDto;
import com.hackathon.transaction.transactionservice.service.TransactionService;


@RestController
@RequestMapping("/transactions/transfer")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("")
    public void fundTransfer(@RequestBody TransactionDto transactionDto) {
        transactionService.transferAmount(transactionDto);
    }
}
