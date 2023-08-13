package com.hackathon.authservice.authenticationservice.service;

import com.hackathon.authservice.authenticationservice.model.TransactionDetails;

public interface AuthenticationService {
 
    public abstract String authenticateTransaction(TransactionDetails transactionDetails);
    
}
