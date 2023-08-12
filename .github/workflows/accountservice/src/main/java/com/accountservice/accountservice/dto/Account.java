package com.accountservice.accountservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Accounts_Table")
public class Account {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)

	 private int Id;
	 @Column(name="account_number")
	 private String acc_number;
	 @Column(name="account_name")
	 private String acc_name;
	 @Column(name="account_EmailID")
	 private String acc_emailId;
	 @Column(name="account_status")
	 private  String acc_status;
	 
	 @Column(name="account_balance")
	 private double acc_balance;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getAcc_number() {
		return acc_number;
	}
	public void setAcc_number(String acc_number) {
		this.acc_number = acc_number;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public String getAcc_emailId() {
		return acc_emailId;
	}
	public void setAcc_emailId(String acc_emailId) {
		this.acc_emailId = acc_emailId;
	}
	public String getAcc_status() {
		return acc_status;
	}
	public void setAcc_status(String acc_status) {
		this.acc_status = acc_status;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	 
	 
}



