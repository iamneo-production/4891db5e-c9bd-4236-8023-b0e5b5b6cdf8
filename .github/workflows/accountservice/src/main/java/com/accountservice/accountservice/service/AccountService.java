package com.accountservice.accountservice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accountservice.accountservice.dao.AccountRepo;
import com.accountservice.accountservice.dto.Account;


@Service
public class AccountService {

	@Autowired
	AccountRepo repo;
	
	public List<Account> getAllAccounts(){
	
		return repo.findAll();
	}
	
	public Account validateAccount(Account acc) {
		return repo.findById(acc.getId()).get();
	}
	
}