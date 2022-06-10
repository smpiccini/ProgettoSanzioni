package com.acme.sanzioni.multe;

import com.acme.sanzioni.infrazione.Infrazione;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class MultaImp implements Multa {
	private Infrazione infrazione;
	private String dataEmissione;
	private String dataMassimaDiPagamento;
	
}
