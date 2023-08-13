package com.audit.auditservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.audit.auditservice.dto.AuditDto;

public interface AuditService {

    ResponseEntity<List<AuditDto>> getAllAudits();

    ResponseEntity<String> createAudit(AuditDto auditDto);
    
}
