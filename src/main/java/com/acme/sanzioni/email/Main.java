package com.acme.sanzioni.email;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			EmailService serverMunicipale = EmailServiceFactory.create(EmailServiceFactory.MUNICIPALE_EMAIL);
			
			Email email = new EnterpriseEmail("enzo.iacchetti@gmail.com",
					"Egregio sig. Enzo Iacchetti ha parcheggiato in doppia fila", 
					"Violazione codice della strada");
			
			serverMunicipale.send(email);
			
		} catch (AuthorizationFailException e) {
			
			System.out.println("Contattare l'amministratore");
			
		} catch (Exception e) {
		    System.out.println(e.getMessage());	
		
		} finally {
			
		}
			
	}

}
