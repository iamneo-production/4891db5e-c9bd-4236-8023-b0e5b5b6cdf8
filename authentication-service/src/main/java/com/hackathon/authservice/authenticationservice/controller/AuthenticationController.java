package com.hackathon.authservice.authenticationservice.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hackathon.authservice.authenticationservice.model.TransactionDetails;
import com.hackathon.authservice.authenticationservice.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    
    @Autowired
    private AuthenticationService authenticationService;

    
	@PostMapping("/validate")
    public String authemticateTransaction(@RequestBody TransactionDetails transactionDetails){
        return authenticationService.authenticateTransaction(transactionDetails);
    }
}