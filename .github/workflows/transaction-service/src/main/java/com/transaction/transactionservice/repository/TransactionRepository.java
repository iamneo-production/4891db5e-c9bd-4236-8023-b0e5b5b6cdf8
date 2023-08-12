package com.transaction.transactionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.transactionservice.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

}
