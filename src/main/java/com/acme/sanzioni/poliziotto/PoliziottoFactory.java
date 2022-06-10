package com.acme.sanzioni.poliziotto;

import com.acme.sanzioni.persona.Persona;

public class PoliziottoFactory {
	public static final int TYPE_POLIZIOTTO = 1;
	
	public static final Poliziotto create(int tipoPersona) throws WrongPersonTypeException {
		Persona persona = null;
		
		if(tipoPersona == TYPE_POLIZIOTTO) {
			persona = new Poliziotto();
		} else throw new WrongPersonTypeException("Hai inserito una persona sbagliata");
		return (Poliziotto) persona;
	}
	
	public static final Poliziotto create (int tipoPersona, String nome, String cognome) throws WrongPersonTypeException {
		Persona persona = create(tipoPersona);
		
		return (Poliziotto) persona;
	}
	
}
