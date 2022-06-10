package com.acme.sanzioni.servizi.stampe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintObjectImp implements PrintObject{

	private String testo;

}
