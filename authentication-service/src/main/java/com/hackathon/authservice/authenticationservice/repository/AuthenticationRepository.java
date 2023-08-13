package com.hackathon.authservice.authenticationservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hackathon.authservice.authenticationservice.model.Account;


@Repository
public interface AuthenticationRepository extends JpaRepository<Account,Integer> {
    @Query(value="select * from account acc where acc.account_number= :accountNo", nativeQuery=true)
    public Optional<Account> findAccounOptional(long accountNo);
}