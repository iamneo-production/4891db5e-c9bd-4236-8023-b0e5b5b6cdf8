package com.hackathon.authservice.authenticationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDetails {
 
    private long senderAccountNo;
    private long recipientAccountNo;
    private String senderName;
    private String recipientName;
}
