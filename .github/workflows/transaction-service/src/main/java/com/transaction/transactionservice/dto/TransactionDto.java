package com.transaction.transactionservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {

    private Integer transactionId;

    private Long sourceAccountNumber;

    private Long destinationAccountNumber;

    private Double transferAmount;

    private LocalDateTime transactinDateTime; 

    private Boolean transactionStatus;
}
