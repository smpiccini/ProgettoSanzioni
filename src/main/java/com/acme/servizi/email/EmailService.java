package com.acme.servizi.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailService {
	private String nome;
	private String userName;
	private String password;

	public void send(Email mail) throws MissingSubjectAndMessageException, 
	MailServerNotAvaibleException, AuthorizationFailException, EmailNotValideException {
		
		if(!isEmailValid(mail.getTo())) {
			throw new EmailNotValideException("Email non valida");
		}
		
		if(mail.getMessage() == null || mail.getMessage().isBlank() ) {
			 
			if(mail.getMessage() == null || mail.getMessage().isBlank() ) {
				throw new MissingSubjectAndMessageException("Messaggio email e oggetto non rilevati");
			}
			
		}
		
		connectToServer();
		
		if(!isServerAvaible()) {
			throw new MailServerNotAvaibleException("Messaggio email e oggetto non rilevati"); }
		}
		
	void connectToServer() throws AuthorizationFailException {
		boolean connected = true;
		
		if(!connected) {
			throw new AuthorizationFailException("Credenziali errate"); }
			
		}
	
	private boolean isEmailValid(String email) {
		return true;
	}
	private boolean isServerAvaible() {
		
		return true;
	
		
		
	}
}
