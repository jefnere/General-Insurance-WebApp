package com.lti.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Admin;
import com.lti.entity.Claim;
import com.lti.services.AdminServices;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/admin")
public class AdminRestController {

	@Autowired
	private AdminServices admin_services;
	
	@GetMapping("/login")
	public boolean authenticate(@RequestParam String username,@RequestParam String password) {
		return admin_services.authenticate(username,password);
	}
	
	@PutMapping("/approve_insurance")
	public void /*Insurance*/ approve_Insurance () {
		return ;
	}
	
	@PutMapping("/approve_claim")
	public Claim approveClaim(@RequestBody int claim_no) {
		return admin_services.approveClaim(claim_no);
	}
	
}
