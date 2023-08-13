package com.audit.auditservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.audit.auditservice.dao.AuditDao;
import com.audit.auditservice.dto.AuditDto;
import com.audit.auditservice.model.Audit;
import com.audit.auditservice.service.AuditService;

@Service
public class AuditServiceImpl implements AuditService{
    @Autowired
    private AuditDao auditDao;

    @Override
    public ResponseEntity<List<AuditDto>> getAllAudits() {
        List<AuditDto> auditDtoList = new ArrayList<>();

        try {
            List<Audit> audit = auditDao.findAll();
            if (audit.isEmpty())
                return new ResponseEntity<>(auditDtoList, HttpStatus.NOT_FOUND);

            for (Audit adit1 : audit) {
                AuditDto auditDto = new AuditDto();
                auditDto.setId(adit1.getId());
                auditDto.setSourceAccoNo(adit1.getSourceAccoNo());
                auditDto.setDestinationAccNo(adit1.getDestinationAccNo());
                auditDto.setTransAmount(adit1.getTransAmount());
                auditDto.setDateTime(adit1.getDateTime());
                auditDto.setStatus(adit1.getStatus());
                auditDtoList.add(auditDto);
            }
            return new ResponseEntity<>(auditDtoList, HttpStatus.OK);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(auditDtoList, HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<String> createAudit(AuditDto auditDto) {
         try {

            Audit audit = new Audit();
            audit.setSourceAccoNo(auditDto.getSourceAccoNo());
            audit.setDestinationAccNo(auditDto.getDestinationAccNo());
            audit.setTransAmount(auditDto.getTransAmount());
            audit.setDateTime(auditDto.getDateTime());
            audit.setStatus(auditDto.getStatus());
            auditDao.save(audit);
            return new ResponseEntity<>("Audit added successfully!", HttpStatus.OK);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>("Audit adding failed!", HttpStatus.BAD_REQUEST);
    }
}
