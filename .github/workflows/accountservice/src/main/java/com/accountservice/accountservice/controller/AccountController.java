package com.accountservice.accountservice.controller;




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
		Account account=service.validateAccount(transaction);
		
		
		if(account!=null && transaction.getTransferAmount()>account.getAcc_balance()) {
			return "Account is validated but it has insufficient balance to transfer";
		}
		}
		catch (Exception e) {
			return "No account found";
		}
		return "Account Found";
		
		
	}
	
		
		
		
    }











