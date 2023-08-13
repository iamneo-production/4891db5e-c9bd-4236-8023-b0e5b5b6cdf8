package com.accountservice.accountservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import com.accountservice.accountservice.dto.Transaction;

@FeignClient(value ="Authentication-Servcie", url = "http://localhost:8080")
public interface AuthenticationService {
    String authemticateTransaction(@RequestBody Transaction transaction);
    
    
}
