package com.accountservice.accountservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountservice.accountservice.dao.AccountRepo;
import com.accountservice.accountservice.dto.Account;
import com.accountservice.accountservice.dto.Transaction;


@Service
public class AccountService {

	@Autowired
	AccountRepo repo;
	
	public List<Account> getAllAccounts(){
	
		return repo.findAll();
	}
	
	public Account validateAccount(Transaction transaction) {



		return repo.findByCustomId(transaction.getSenderAccountNo());
	}
	
	
      
}