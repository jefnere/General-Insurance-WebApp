package com.lti.services;

import com.lti.entity.Admin;
import com.lti.entity.Claim;

public interface AdminServices {

	public boolean authenticate(String username,String password);
	public Claim approveClaim(int claimNo);
	public void/*Insurance*/ approveInsurance();
	//public Admin createAdmin(Admin admin);
	
}
