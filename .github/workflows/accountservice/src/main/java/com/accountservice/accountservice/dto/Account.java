package com.accountservice.accountservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor
@Entity
@Table(name="Accounts_Table")
public class Account {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
   private Integer accountId;
   @Column(name = "account_number")
    private long accountNo;

	 @Column(name="account_name")
	 private String acc_name;
	 @Column(name="account_EmailID")
	 private String acc_emailId;
	 @Column(name="account_status")
	 private  String acc_status;
	 
	 @Column(name="account_balance")
	 private double acc_balance;
	
	 
	 
}



