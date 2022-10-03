package com.example.demo.exception;

public class DrinkNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrinkNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

	public DrinkNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
}
