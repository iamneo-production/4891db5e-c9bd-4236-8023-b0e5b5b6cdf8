package com.audit.auditservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audit.auditservice.dto.AuditDto;
import com.audit.auditservice.service.AuditService;

@RestController
@RequestMapping(path = "/audit/log")
public class AuditController {
    @Autowired
    private AuditService auditService;

    
    @GetMapping("/all/")
    public ResponseEntity<List<AuditDto>> getAllAudits() {
        return auditService.getAllAudits();
    }
    //add an audit
    @PostMapping
    public ResponseEntity<String> createAudit(
            @RequestBody AuditDto auditDto){
        return auditService.createAudit(auditDto);
    }
    @GetMapping("/{auditId}")
    public ResponseEntity<AuditDto> getAuditByID(@PathVariable Integer auditId) {
        return auditService.getAuditByID(auditId);
    }
}
