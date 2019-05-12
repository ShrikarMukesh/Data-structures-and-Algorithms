package com.stackqueuearray;

public class StackIsEmptyException extends RuntimeException {

	private static final long serialVersionUID = -6593337737591892783L;
	public StackIsEmptyException(String message) {
		super(message);
	}
}
