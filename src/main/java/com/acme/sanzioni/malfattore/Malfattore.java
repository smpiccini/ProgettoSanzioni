package com.acme.sanzioni.malfattore;

import com.acme.sanzioni.persona.PersonaImp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor


public  class Malfattore extends PersonaImp{
	private String nome;
	private String cognome;
	private String email;
	
	public Malfattore (String nome, String cognome, String email) {
		super (nome, cognome);
		this.email = email;
	}
}
