package com.audit.auditservice.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "audit")
public class Audit {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionId")
    private Integer transactionId;

    @Column(name = "sourceAccountNumber")
    private Long sourceAccountNumber;

    @Column(name = "destinationAccountNumber")
    private Long destinationAccountNumber;

    @Column(name = "transferAmount")
    private Double transferAmount;

    @Column(name = "transactinDateTime")
    private LocalDateTime transactinDateTime;

    @Column(name = "transactionStatus")
    private Boolean transactionStatus;
   
}
