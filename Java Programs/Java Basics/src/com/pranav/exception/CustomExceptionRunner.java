package com.pranav.exception;

public class CustomExceptionRunner {

	public static void main(String[] args) throws CustomException{
//		try {
			throw new CustomException("HIII");
//		}catch(CustomException e) {
//			e.printStackTrace();
//		}
	}

}
