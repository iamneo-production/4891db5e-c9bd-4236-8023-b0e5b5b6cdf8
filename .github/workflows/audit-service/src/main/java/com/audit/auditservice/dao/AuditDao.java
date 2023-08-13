package com.audit.auditservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.audit.auditservice.model.Audit;

public interface AuditDao extends JpaRepository<Audit, Integer>{
    @Query("select a from Audit a where a.id=:id")
    Audit findByCustomId(Integer id);
}
