package com.accountservice.accountservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class TransactionDto {
    private Long sourceAccountNumber;




    private Long destinationAccountNumber;




    private Double transferAmount;
}