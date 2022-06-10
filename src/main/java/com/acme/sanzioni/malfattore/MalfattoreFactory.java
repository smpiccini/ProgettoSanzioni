package com.acme.sanzioni.malfattore;

import com.acme.sanzioni.persona.Persona;
import com.acme.sanzioni.poliziotto.WrongPersonTypeException;

public class MalfattoreFactory {
	public static final int TYPE_MALFATTORE = 2;
	
	public final static Malfattore create (int tipoPersona) throws WrongPersonTypeException {
		Persona persona = null;
		
		if(tipoPersona == TYPE_MALFATTORE) {
			persona = new Malfattore();
		} else throw new WrongPersonTypeException("Hai inserito una persona sbaglaita");
		return (Malfattore) persona;
 	}
	
	public final static Malfattore create (int tipoPersona, String nome, String cognome, String email) throws WrongPersonTypeException {
		Persona persona = create(tipoPersona);
		return (Malfattore) persona; 
		}
	
	public final static Malfattore create() throws WrongPersonTypeException {
		return create (TYPE_MALFATTORE);
	}
} 
