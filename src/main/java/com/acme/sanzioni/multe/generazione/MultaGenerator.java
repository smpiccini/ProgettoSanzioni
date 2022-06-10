package com.acme.sanzioni.multe.generazione;

import java.util.List;

import com.acme.sanzioni.infrazione.Infrazione;
import com.acme.sanzioni.multe.Multa;
import com.acme.sanzioni.multe.MultaFactory;
import com.acme.sanzioni.multe.WronTypeMultaException;

public class MultaGenerator {
	private final static String DATA_INFRAZIONE="10/06/2022";
	private final static String DATA_MASSIMA="10/10/2022";
	
	public static void generate (Infrazione infrazione) throws WronTypeMultaException {
		Multa multa = MultaFactory.create(MultaFactory.MULTA_GENERICA, infrazione, DATA_INFRAZIONE, DATA_MASSIMA);
		
	}
	
	
 public static void generate (List<Infrazione> infrazioni) {
	 for (Infrazione infrazione : infrazioni) {
		 generate(infrazioni);
		
	}
 }
}

