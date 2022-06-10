package com.acme.sanzioni.multe;

import com.acme.sanzioni.infrazione.Infrazione;

public class MultaFactory {
	
	private static final int MULTA = 1;

	public final static Multa create(int tipoMulta) throws WronTypeMultaException  {
		Multa multa=null;
		if(tipoMulta==MULTA) {
			multa=new MultaConcreta(); 
		} else {
			throw new WronTypeMultaException("Tipo di multa non prevista");
		}

		return multa;

	}
	 public final static Multa create() throws WronTypeMultaException {
		 return create (MULTA);
		 
	 }

public final static Multa create (int tipoMulta, Infrazione infrazione, String dataEmissione, String dataMassimaDipagamento ) throws WronTypeMultaException {
	Multa multa =create(tipoMulta);
	multa.setDataEmissione(dataEmissione);
	multa.setDataMassimaDiPagamento(dataMassimaDipagamento);
	multa.setInfrazione(infrazione);
	return multa;
}
}



