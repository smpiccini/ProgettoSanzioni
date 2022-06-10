package com.acme.sanzioni.servizi.stampe;

public class MainTestStampe {

	public static void main(String[] args) {
		PrintServer srvProvinciale = null;
		PrintServer srvMunicipale = null;
		try {
			srvProvinciale = PrintServerFactory.create(1);
			srvMunicipale = PrintServerFactory.create(2);
		} catch(WrongPrintServerException e) {
			System.out.println("ERRORE: " + e.getMessage());
		}
		PrintObject document = new PrintObjectImp();
		document.setTesto("Testo di prova.");
		
		if (srvProvinciale != null) {
			srvProvinciale.print(document);
		}
		if (srvMunicipale != null) {
			srvMunicipale.print(document);
		}
		
	}

}
