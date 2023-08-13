package com.audit.auditservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.audit.auditservice.model.Audit;

public interface AuditDao extends JpaRepository<Audit, Integer>{
    
}
