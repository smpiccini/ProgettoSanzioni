package com.acme.sanzioni.multe;

import com.acme.sanzioni.email.AuthorizationFailException;
import com.acme.sanzioni.email.Email;
import com.acme.sanzioni.email.EmailFactory;
import com.acme.sanzioni.email.EmailNotValideException;
import com.acme.sanzioni.email.EmailService;
import com.acme.sanzioni.email.EmailServiceFactory;
import com.acme.sanzioni.email.MailServerNotAvaibleException;
import com.acme.sanzioni.email.MissingSubjectAndMessageException;
import com.acme.sanzioni.email.WrongEmailTypeException;

public class MultaSendEmail {
	public static void SendMail(Multa multa, int tipoServer) throws WrongEmailTypeException, MissingSubjectAndMessageException, MailServerNotAvaibleException, AuthorizationFailException, EmailNotValideException {
		EmailService emailServer;
		if(tipoServer==EmailServiceFactory.PROVINCIALE_EMAIL ) {
			emailServer=  EmailServiceFactory.create(EmailServiceFactory.PROVINCIALE_EMAIL);
			
		} else {
			
			emailServer=  EmailServiceFactory.create(EmailServiceFactory.MUNICIPALE_EMAIL);
		}
		Email email=EmailFactory.create(multa.getInfrazione().getMalfattore().getEmail(), "Le comunichiamo che in data " +  multa.getInfrazione().getDataInfrazione() , "Emissione multa");
		emailServer.send(email);
	}

}
