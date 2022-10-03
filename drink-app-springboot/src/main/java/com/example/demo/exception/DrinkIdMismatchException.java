package com.example.demo.exception;

public class DrinkIdMismatchException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DrinkIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }

	public DrinkIdMismatchException() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}


