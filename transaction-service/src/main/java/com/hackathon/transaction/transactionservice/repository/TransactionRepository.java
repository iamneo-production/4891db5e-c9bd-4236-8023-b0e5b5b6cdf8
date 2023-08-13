package com.hackathon.transaction.transactionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.transaction.transactionservice.model.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer>{

}