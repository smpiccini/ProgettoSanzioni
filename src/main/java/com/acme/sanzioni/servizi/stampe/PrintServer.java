package com.acme.sanzioni.servizi.stampe;

import com.acme.sanzioni.email.AuthorizationFailException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintServer {

	private String networkName;
	private String userName;
	private String password;
	
	public void print(PrintObject document) 
			throws AuthorizationFailException {
		connectToServer();
		System.out.println(document.getTesto());
		
	}
	
	void connectToServer() throws AuthorizationFailException {
		boolean connected = true;
		
		if(!connected) {
			throw new AuthorizationFailException("Credenziali errate"); }
			
		}

}
