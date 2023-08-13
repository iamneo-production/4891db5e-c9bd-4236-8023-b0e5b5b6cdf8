package com.accountservice.accountservice.controller;

import javax.swing.Spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountservice.accountservice.dto.Account;
import com.accountservice.accountservice.service.AccountService;
import com.accountservice.accountservice.dto.Transaction;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AccountController {
	
	@Autowired
	 private AccountService service;
	
	@GetMapping("api/all")
	public List<Account> getAllAccounts(){
		return service.getAllAccounts();
	}
	

	
	@PostMapping("/accounts/validate")
	
	public String accountValidate(@RequestBody Transaction transaction) {
		
		try {
		 Transaction trans=service.accountValidate(transaction);
		
		
		if(trans!=null && acc.getAcc_balance()>500) {
			return "Account is validated and it has sufficient balance";
		}
		}
		catch (Exception e) {
			return "No account found";
		}
		return "Account Found";
		
		
	}
	
		
		
		
    }











