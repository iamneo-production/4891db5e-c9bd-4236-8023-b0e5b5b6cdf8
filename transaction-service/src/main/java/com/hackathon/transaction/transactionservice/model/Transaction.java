package com.hackathon.transaction.transactionservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="transaction")
public class Transaction{

    //Trans ID, Source Acc no, Destination Acc no, transfer amount , Date , time, Trans status

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    private Long sourceAccountNumber;

    private Long destinationAccountNumber;

    private Double transferAmount;

    private LocalDateTime transactinDateTime;

    private Boolean transactionStatus;

}

