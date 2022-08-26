package com.lti.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lti.services.UserServices;

@RestController
public class RenewController {
	
	@Autowired
	private UserServices userservice;

}
