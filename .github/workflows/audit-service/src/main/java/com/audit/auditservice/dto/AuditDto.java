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
    private Integer id;

    private Long sourceAccoNo;

    private Long destinationAccNo;

    private Double transAmount;

    private LocalDateTime dateTime;

    private Boolean status;
}
