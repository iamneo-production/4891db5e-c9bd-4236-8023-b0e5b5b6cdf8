package com.hackathon.transaction.transactionservice.service;

import org.springframework.cloud.openfeign.FeignClient;


@FeignClient(value ="notification-service",url ="http://localhost:8080")
public interface NotificationService {
    
}
