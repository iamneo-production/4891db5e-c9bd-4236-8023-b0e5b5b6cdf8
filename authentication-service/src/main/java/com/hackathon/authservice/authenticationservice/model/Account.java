package com.hackathon.authservice.authenticationservice.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.apache.tomcat.jni.Address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="account", uniqueConstraints=@UniqueConstraint(columnNames="account_number"))
public class Account {

    @Id
    @Column(name = "customer_id")
    private Integer accountId;

    @Column(name = "account_number")
    private long accountNo;

    @Column(name = "account_balance")
    private double accountBalance;

    @Column(name = "account_last_modified")
    private LocalDateTime lastUpdated;

    @Column(name = "acc_status")
    private String accountStatus;

    @OneToOne
    @MapsId
    @JoinColumn(name = "customer_id")
    private Customer customerDetails;
}
