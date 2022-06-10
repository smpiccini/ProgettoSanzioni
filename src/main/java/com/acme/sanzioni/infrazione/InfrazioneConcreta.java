package com.acme.sanzioni.infrazione;

import com.acme.sanzioni.malfattore.Malfattore;
import com.acme.sanzioni.poliziotto.Poliziotto;

public class InfrazioneConcreta extends InfrazioneImp {

	public InfrazioneConcreta(Poliziotto poliziotto, Malfattore malfattore, String articoloComma, String dataInfrazione,
			double importoDaPagare, String descrizione) {
		super(poliziotto, malfattore, articoloComma, dataInfrazione, importoDaPagare, descrizione);
		// TODO Auto-generated constructor stub
	}

	public InfrazioneConcreta() {
		// TODO Auto-generated constructor stub
	}

}
