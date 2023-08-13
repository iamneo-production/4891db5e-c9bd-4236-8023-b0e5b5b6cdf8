package com.notification.notificationservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senderEmail;
    private Long senderAccNo;
  
    private LocalDateTime sentTimestamp;
    
   
}