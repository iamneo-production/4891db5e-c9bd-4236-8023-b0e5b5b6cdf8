package com.accountservice.accountservice.service;


import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountservice.accountservice.dao.AccountRepo;
import com.accountservice.accountservice.dto.Account;
import com.accountservice.accountservice.dto.Transaction;


@Service
public class AccountService {
	@Autowired
	AuthenticationService authenticationService;

	@Autowired
	TransactionService transactionService;

	@Autowired
	AccountRepo repo;
	
	public List<Account> getAllAccounts(){
	   return repo.findAll();
	}
	
	public String validateAccount(Transaction transaction) {

		String validationResponse=authenticationService.authemticateTransaction(transaction);
		if(validationResponse.equals("OK")){
			String statement = checkAccountBal(transaction.getSenderAccountNo(),transaction.getTransferAmount());
			if(statement.equals("OK")) {
			 	transactionService.fundTransfer(transaction.toTransactionDto(transaction));
				return "success";
			}
			
		}
		return  "Error";

	}	
	 private String checkAccountBal(long accountNo,double transferAmount){
			Account account=repo.findByAccountNo(accountNo);
		if(Objects.isNull(account))
			return "Account is not exist";

		if(account.getAcc_balance()<transferAmount) 
			return "Account is validate but it has insufficient balance to transfer";
		 return "OK";
	}
	
	
	
      
}