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
    @Column(name = "id")
    private Integer id;

    @Column(name = "sourceAccoNo")
    private Long sourceAccoNo;

    @Column(name = "destinationAccNo")
    private Long destinationAccNo;

    @Column(name = "transAmount")
    private Double transAmount;

    @Column(name = "DateTime")
    private LocalDateTime dateTime;

    @Column(name = "status")
    private Boolean status;
}
