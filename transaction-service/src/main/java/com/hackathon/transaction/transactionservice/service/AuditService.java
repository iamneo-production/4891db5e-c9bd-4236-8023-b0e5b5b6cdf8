package com.hackathon.transaction.transactionservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hackathon.transaction.transactionservice.dto.TransactionDto;

@FeignClient(value ="AUDIT-SERVICE",url ="http://localhost:8080")
public interface AuditService {
    @PostMapping("/audit/log")
    ResponseEntity<String> createAudit(@RequestBody TransactionDto auditDto); 
}
