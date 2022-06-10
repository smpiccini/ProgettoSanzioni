package com.acme.sanzioni;

import java.util.ArrayList;
import java.util.List;

import com.acme.sanzioni.email.EmailServiceFactory;
import com.acme.sanzioni.infrazione.Infrazione;
import com.acme.sanzioni.infrazione.InfrazioneFactory;
import com.acme.sanzioni.infrazione.WrongInfingementTypeException;
import com.acme.sanzioni.malfattore.*;
import com.acme.sanzioni.multe.generazione.MultaGenerator;
import com.acme.sanzioni.poliziotto.*;

public class Main {

	public static void main(String[] args) {
		Infrazione infrazione;
		
		
		
		
		try {
			Poliziotto p = PoliziottoFactory.create(
					PoliziottoFactory.TYPE_POLIZIOTTO, "Agente", "P");
			Malfattore m = MalfattoreFactory.create(
					MalfattoreFactory.TYPE_MALFATTORE, "Don", "Pugliesi", 
					"mafia@gmail.com");
			
			infrazione = InfrazioneFactory.create(
					InfrazioneFactory.TYPE_INFRAZIONE, p, m, 
					"Articolo-1, Coma-1", "09/06/2022",
					2, "Guida in stato di ebrezza");
			
			MultaGenerator.generate(infrazione, 
					EmailServiceFactory.MUNICIPALE_EMAIL);
			
			
		} catch (Exception e) {
			System.out.println("ERRORE: " + e.getMessage());
		}
		
		
		
	}

}
