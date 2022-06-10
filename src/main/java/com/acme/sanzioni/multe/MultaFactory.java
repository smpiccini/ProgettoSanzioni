package com.acme.sanzioni.multe;

import com.acme.sanzioni.infrazione.Infrazione;

public class MultaFactory {
	
	public static final int MULTA_GENERICA = 1;

	public final static Multa create(int tipoMulta) throws WronTypeMultaException  {
		Multa multa=null;
		if(tipoMulta==MULTA_GENERICA) {
			multa=new MultaConcreta(); 
		} else {
			throw new WronTypeMultaException("Tipo di multa non prevista");
		}

		return multa;

	}
	 public final static Multa create() throws WronTypeMultaException {
		 return create (MULTA_GENERICA);
		 
	 }

public final static Multa create (int tipoMulta, Infrazione infrazione, String dataEmissione, String dataMassimaDipagamento ) throws WronTypeMultaException {
	Multa multa =create(tipoMulta);
	multa.setDataEmissione(dataEmissione);
	multa.setDataMassimaDiPagamento(dataMassimaDipagamento);
	multa.setInfrazione(infrazione);
	return multa;
}
}



