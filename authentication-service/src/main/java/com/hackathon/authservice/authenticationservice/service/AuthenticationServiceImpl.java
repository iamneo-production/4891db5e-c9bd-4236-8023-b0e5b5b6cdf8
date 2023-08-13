package com.hackathon.authservice.authenticationservice.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.authservice.authenticationservice.model.Account;
import com.hackathon.authservice.authenticationservice.model.TransactionDetails;
import com.hackathon.authservice.authenticationservice.repository.AuthenticationRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{
 
    @Autowired
    private AuthenticationRepository authenticationRepository;
    
    public String authenticateTransaction(TransactionDetails transactionDetails){
               if(!isAccountDetailsCorrect(transactionDetails.getSenderAccountNo(), transactionDetails.getSenderName())){
                 return "FAILD: incorrect sender Details or account status is NOT_WORKING";
               }else if (!isAccountDetailsCorrect(transactionDetails.getRecipientAccountNo(), transactionDetails.getRecipientName())){
                 return "FAILD: incorrect recipient Details or account status is NOT_WORKING";
               }
               return "OK";
    }


    public boolean isAccountDetailsCorrect(long accountNo, String customerName){
      
      Optional<Account> accountoOptional = authenticationRepository.findAccounOptional(accountNo);
              if(accountoOptional.isEmpty()){
                  return false;
              }else{
                  Account account = accountoOptional.get();
              if (account.getCustomerDetails().getCustomerName().equalsIgnoreCase(customerName) && account.getAccountStatus().equalsIgnoreCase("working")){
                System.out.println("name details"+ account.getCustomerDetails().getCustomerName()+ "  status  "+account.getAccountStatus());
                return true;
              }else{
                 return false;
              }
          }

            
    }
}
