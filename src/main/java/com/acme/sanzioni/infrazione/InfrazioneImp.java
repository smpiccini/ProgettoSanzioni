package com.acme.sanzioni.infrazione;

import com.acme.sanzioni.malfattore.Malfattore;
import com.acme.sanzioni.poliziotto.Poliziotto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public abstract class InfrazioneImp implements Infrazione {
	private Poliziotto poliziotto;
	private Malfattore malfattore;
	private String articoloComma;
	private String dataInfrazione;
	private double importoDaPagare;
	private String descrizione;
}
