package com.marianarosa.Aula61aula62sbmongodb.services.exception;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException (String msg) {
		super(msg);
	}

}
