package br.com.projBrq.api.services;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public ObjectNotFoundException(String message) {
		super(message);

	}

}
