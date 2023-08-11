package com.accountservice.accountservice.controller;

import javax.swing.Spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountservice.accountservice.dto.Account;

@RestController
public class AccountController {


    @PostMapping("/accounts/validate")
    public ResponseEntity<TransferValidationResponse> validateTransfer(@RequestBody TransferValidationRequest request) {
       
        
        boolean isValid = validateAccountDetailsAndFunds(request);

        TransferValidationResponse response = new TransferValidationResponse();
        response.setIsValid(isValid);

        if (isValid) {
            response.setMessage("Transfer is valid. Sufficient funds are available.");
        } else {
            response.setMessage("Transfer is not valid. Insufficient funds or invalid account details.");
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    private boolean validateAccountDetailsAndFunds(TransferValidationRequest request) {
        // Implement your validation logic here.
        public TransferValidationResponse validateAccountDetails(TransferValidationRequest request) {
        Account sourceAccount = accountRepository.findByUsername(request.getSourceUsername());
        Account destinationAccount = accountRepository.findByUsername(request.getDestinationUsername());

        TransferValidationResponse response = new TransferValidationResponse();

        if (sourceAccount == null || destinationAccount == null) {
            response.setIsValid(false);
            response.setMessage("Invalid source or destination account.");
        } else if (!sourceAccount.isActive()) {
            response.setIsValid(false);
            response.setMessage("Source account is not active.");
        } else if (sourceAccount.getBalance() < request.getAmount()) {
            response.setIsValid(false);
            response.setMessage("Insufficient funds in the source account.");
        } else {
            response.setIsValid(true);
            response.setMessage("Transfer is valid. Sufficient funds are available.");
        }

        return response;
    }

    // Other service methods as needed
    }






        // You would typically query your database for account details and check funds.
        // Return true if the transfer is valid, false otherwise.
        return true; // Placeholder, you should implement actual logic here.
    }
}





