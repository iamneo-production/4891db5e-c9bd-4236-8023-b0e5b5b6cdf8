package com.accountservice.accountservice.controller;

import javax.swing.Spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accountservice.accountservice.dto.Account;
import com.accountservice.accountservice.service.AccountService;




@RestController
public class AccountController {
	
	@Autowired
	 private AccountService service;
	
	@GetMapping("api/all")
	public List<Account> getAllAccounts(){
		return service.getAllAccounts();
	}
	
	
	@PostMapping("/accounts/validate")
    public String getItems(@RequestHeader("Authorization") String authorizationHeader) {
        // Validate JWT token from the Authorization header
        String token = authorizationHeader.replace("Bearer ", "");

        try {
			if(token.equals("hskdfjUTustRgahsgd")) {
				return "Hello, User.";
				if(acc!=null && acc.getAcc_balance()>500) {
			return "Account is validated and it has sufficient balance";
		}
			}
			 
			else {
   return "You don't have access to this resource";
			}
            // Return the list of items (or any other data) if the token is valid.
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid token");
        }
    }
	
	@PostMapping("/accounts/validate")
	
	public String accountValidate(@RequestBody Account account) {
		
		try {
		Account acc=service.validateAccount(account);
		
		
		if(acc!=null && acc.getAcc_balance()>500) {
			return "Account is validated and it has sufficient balance";
		}
		}
		catch (Exception e) {
			return "No account found";
		}
		return "Account Found";
		
		
	}
	
		
		
		
    }











