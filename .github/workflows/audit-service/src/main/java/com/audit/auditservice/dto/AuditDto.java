package com.audit.auditservice.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuditDto {
    private Integer transactionId;

    private Long sourceAccountNumber;

    private Long destinationAccountNumber;

    private Double transferAmount;

    private LocalDateTime transactinDateTime;

    private Boolean transactionStatus;
}
