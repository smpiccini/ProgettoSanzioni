package com.acme.sanzioni.servizi.stampe;

public class PrintServerFactory {

	public static final int SERVER_UFFICIO_PROVINCIALE = 1;
	public static final int SERVER_POLIZIA_MUNICIPALE = 2;
	
	public static PrintServer create(int tipoServer) 
			throws WrongPrintServerException {
		PrintServer server = new PrintServer();
		if(tipoServer == SERVER_UFFICIO_PROVINCIALE) {
			server.setUserName("admin");
			server.setPassword("werty");
			server.setNetworkName("PROVINCIALE_SRV_PRINT");
		} else if (tipoServer == SERVER_POLIZIA_MUNICIPALE) {
			server.setUserName("admin");
			server.setPassword("7865");
			server.setNetworkName("MUNICIPALE_SRV_PRINT");
		} else {
			throw new WrongPrintServerException("Tipo server non previsto");
		}
		
		
		return server;
	}

}
