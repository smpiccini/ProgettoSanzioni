package com.acme.sanzioni.multe;

import com.acme.sanzioni.infrazione.Infrazione;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MultaConcreta extends MultaImp {public MultaConcreta(Infrazione infrazione, String dataEmissione, String dataMassimaDiPagamento) {
		super(infrazione, dataEmissione, dataMassimaDiPagamento);
		// TODO Auto-generated constructor stub
	}
	
		
	}
	

	

