package com.acme.sanzioni.multe;

import com.acme.sanzioni.infrazione.Infrazione;

public interface Multa {

	String getDataEmissione();

	String getDataMassimaDiPagamento();

	Infrazione getInfrazione();

	void setDataEmissione(String dataEmissione);

	void setDataMassimaDiPagamento(String dataMassimaDiPagamento);

	void setInfrazione(Infrazione infrazione);

}