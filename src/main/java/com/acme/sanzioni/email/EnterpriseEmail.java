package com.acme.sanzioni.email;


import lombok.Data;

@Data
public class EnterpriseEmail extends EmailImp {
	
	public EnterpriseEmail(String to, String message, String subject) {
		super(to, message, subject);
	
	}

	@Override
	public void setObject(String object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getObject() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
