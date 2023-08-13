package com.audit.auditservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

                auditDto.setTransactionId(adit1.getTransactionId());
                auditDto.setSourceAccountNumber(adit1.getSourceAccountNumber());
                auditDto.setDestinationAccountNumber(adit1.getDestinationAccountNumber());
                auditDto.setTransferAmount(adit1.getTransferAmount());
                auditDto.setTransactinDateTime(adit1.getTransactinDateTime());
                auditDto.setTransactionStatus(adit1.getTransactionStatus());
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
            audit.setSourceAccountNumber(auditDto.getSourceAccountNumber());
            audit.setDestinationAccountNumber(auditDto.getDestinationAccountNumber());
            audit.setTransferAmount(auditDto.getTransferAmount());
            audit.setTransactinDateTime(auditDto.getTransactinDateTime());
            audit.setTransactionStatus(auditDto.getTransactionStatus());
            auditDao.save(audit);
            return new ResponseEntity<>("Audit added successfully!", HttpStatus.OK);
         
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>("Audit adding failed!", HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<AuditDto> getAuditByID(Integer auditId) {
        try {
            Audit audit = auditDao.findByCustomId(auditId);
            AuditDto auditDto = new AuditDto();
            if (Objects.isNull(audit))
                return new ResponseEntity<>(auditDto, HttpStatus.NOT_FOUND);

            auditDto.setTransactionId(audit.getTransactionId());
            auditDto.setSourceAccountNumber(audit.getSourceAccountNumber());
            auditDto.setDestinationAccountNumber(audit.getDestinationAccountNumber());
            auditDto.setTransferAmount(audit.getTransferAmount());
            auditDto.setTransactinDateTime(audit.getTransactinDateTime());
            auditDto.setTransactionStatus(audit.getTransactionStatus());

            return new ResponseEntity<>(auditDto, HttpStatus.OK);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new ResponseEntity<>(new AuditDto(), HttpStatus.BAD_REQUEST);
    }
    
}
