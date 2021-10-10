package com.pranav.exception;

public class CustomException extends Exception {
	String message;
	
	CustomException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return "CustomException Occurred "+message;
	}
}
