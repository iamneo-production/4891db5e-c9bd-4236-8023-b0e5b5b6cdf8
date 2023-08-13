package com.accountservice.accountservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.accountservice.accountservice.dto.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

    @Query(value="select * from account acc where acc.account_number= :accountNo", nativeQuery=true)
    Account findByCustomId(Long accountNo);


}
	
	


