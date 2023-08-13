package com.accountservice.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accountservice.accountservice.dto.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
}
	
	


