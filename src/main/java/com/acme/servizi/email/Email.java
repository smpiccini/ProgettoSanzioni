package com.acme.servizi.email;

public interface Email {
	public void setTo(String to);
	public String getTo();
	
	public void setMessage(String message);
	public String getMessage();
	
	public void setObject(String object);
	public String getObject();

}
