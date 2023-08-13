package com.accountservice.accountservice.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.Setter;




@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

public class Transaction {

    

    private long senderAccountNo;

    private long recipientAccountNo;

    private String senderName;

    private String recipientName;

    private double transferAmount;
  public TransactionDto  toTransactionDto(Transaction transaction){
    TransactionDto dto=new TransactionDto(transaction.getSenderAccountNo(),transaction.getRecipientAccountNo(),transaction.getTransferAmount());
    return dto;
    }
    
}