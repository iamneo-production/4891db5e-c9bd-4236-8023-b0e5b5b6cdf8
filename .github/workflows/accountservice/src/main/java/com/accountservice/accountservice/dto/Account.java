package com.accountservice.accountservice.dto;

import lombok.Data;

@Data
public class Account {
    private int Id;
   private String accountNumber;
   private String accHolderName;
   private long customerId;
   private String DOB;
   private String createdDate;
   private String accHolderAddress;
   private String branch;
   private double balance;


}