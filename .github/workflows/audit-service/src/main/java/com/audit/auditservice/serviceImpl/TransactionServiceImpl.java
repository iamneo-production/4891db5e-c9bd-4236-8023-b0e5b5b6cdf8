package com.audit.auditservice.serviceImpl;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "TRANSACTION-SERVICE", url = "http://localhost:8080")
public interface TransactionServiceImpl {
    
}
