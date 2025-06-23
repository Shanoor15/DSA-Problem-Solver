package com.nt.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankOperationsController {

	@GetMapping("/welcome")
	public ResponseEntity<String> showHome(){
		System.out.println("BankOperationsController.showHome()");
		return new ResponseEntity<String>("welcome to home page::",HttpStatus.OK);
	}
	
	@GetMapping("/offers")
	public ResponseEntity<String> showOffers(){
		System.out.println("BankOperationsController.showHome()");
		return new ResponseEntity<String>("Offers page::",HttpStatus.OK);
	}
	
	@GetMapping("/loan_approve")
	@PreAuthorize("hasAuthority('MANAGER')")
	public ResponseEntity<String> approveLoan(){
		System.out.println("BankOperationsController.showHome()");
		int amount=new Random().nextInt(12000000);
		return new ResponseEntity<String>("Loan Approved,the amount is::"+amount,HttpStatus.OK);
	}
	
	@GetMapping("/balance")
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')")
	public ResponseEntity<String> showBalance(){
		System.out.println("BankOperationsController.showHome()");
		int amount=new Random().nextInt(2000000);
		return new ResponseEntity<String>("Balance in Account is::"+amount,HttpStatus.OK);
	}
}
