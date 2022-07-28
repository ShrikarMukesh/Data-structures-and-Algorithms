package com.stackqueuearray;

public class StackIsFullException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StackIsFullException(String message) {
		super(message);
	}
}
