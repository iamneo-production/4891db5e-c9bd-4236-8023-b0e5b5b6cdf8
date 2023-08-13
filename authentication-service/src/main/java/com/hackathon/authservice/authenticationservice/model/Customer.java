package com.hackathon.authservice.authenticationservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@Data
public class Customer {
 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    @Column(name = "customer_id")
    private Integer customerId;
   
    @Column(name = "customer_name")
    private String customerName;
    
    @Column(name = "customer_email")
    private String email;
    
    @Column(name = "customer_address")
    private String address;
   
    @OneToOne(mappedBy = "customerDetails", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private  Account accountDetails;

}
