package com.acme.sanzioni.infrazione;

import com.acme.sanzioni.malfattore.Malfattore;
import com.acme.sanzioni.poliziotto.Poliziotto;

public interface Infrazione {

	String getArticoloComma();

	String getDataInfrazione();

	String getDescrizione();

	double getImportoDaPagare();

	Malfattore getMalfattore();

	Poliziotto getPoliziotto();

	void setArticoloComma(String articoloComma);

	void setDataInfrazione(String dataInfrazione);

	void setDescrizione(String descrizione);

	void setImportoDaPagare(double importoDaPagare);

	void setMalfattore(Malfattore malfattore);

	void setPoliziotto(Poliziotto poliziotto);

}