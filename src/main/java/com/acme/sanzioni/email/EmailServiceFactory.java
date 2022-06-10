package com.acme.sanzioni.email;

public class EmailServiceFactory {
	public static final int MUNICIPALE_EMAIL = 2;
	public static final int PROVINCIALE_EMAIL = 1;
	
	public static EmailService create(int serverPolice) throws AuthorizationFailException {
		EmailService service = null;
		
		if(serverPolice == MUNICIPALE_EMAIL) {
			service.setNome("email.municipale.polizia.gov.com");
			service.setUserName("Utente");
			service.setPassword("123456789");
		} else {
			service.setNome("email.provinciale.polizia.gov.com");
			service.setUserName("User");
			service.setPassword("987654321");
		}
		
		service.connectToServer();
		return service;
	}

	public EmailServiceFactory() {
	
	}

}
