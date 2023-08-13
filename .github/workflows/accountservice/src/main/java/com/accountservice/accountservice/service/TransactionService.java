package com.accountservice.accountservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.accountservice.accountservice.dto.TransactionDto;

@FeignClient(value ="TRANSACTION-SERVICE", url = "http://localhost:8080")
public interface TransactionService {
    @PostMapping( "/transactions/transfer")
    public void fundTransfer(@RequestBody TransactionDto transactionDetails);

	

    
}
