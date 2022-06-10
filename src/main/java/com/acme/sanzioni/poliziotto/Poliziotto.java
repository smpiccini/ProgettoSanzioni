package com.acme.sanzioni.poliziotto;

import com.acme.sanzioni.persona.Persona;
import com.acme.sanzioni.persona.PersonaImp;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor

public class Poliziotto extends  PersonaImp {
	
	public Poliziotto (String nome, String cognome) {
		super(nome, cognome);
	}

}
