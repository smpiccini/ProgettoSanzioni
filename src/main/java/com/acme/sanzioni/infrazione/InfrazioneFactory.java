package com.acme.sanzioni.infrazione;

import com.acme.sanzioni.poliziotto.Poliziotto;
import com.acme.sanzioni.malfattore.Malfattore;

public class InfrazioneFactory {
	public final static int TYPE_INFRAZIONE = 1;
	
	public final static InfrazioneConcreta create(int tipoInfrazione) throws WrongInfingementTypeException {
		
		Infrazione infrazione = null;
		
		if(tipoInfrazione == TYPE_INFRAZIONE) {
			infrazione = new InfrazioneConcreta();
		} else throw new WrongInfingementTypeException("Tipo di infrazione errato");
		return (InfrazioneConcreta) infrazione;
	}
	
	public final static InfrazioneConcreta create(int tipoInfrazione, Poliziotto poliziotto, Malfattore malfattore,
			String articoloComma, String dataInfrazione, double importoDaPagare, String descrizione) throws WrongInfingementTypeException {
		Infrazione infrazione = create (tipoInfrazione);
		
		return (InfrazioneConcreta) infrazione;
	}
	
	public final static InfrazioneConcreta create() throws WrongInfingementTypeException {
		return create(TYPE_INFRAZIONE);
	}

}
