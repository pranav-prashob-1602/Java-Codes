package com.pranav.exception;

import java.io.IOException;

public class ExceptionRunner {

	public static void main(String[] args) {
		ExceptionB b = new ExceptionB();
		b.fun();
		ExceptionA a = new ExceptionA();
		try {
			a.fun();
		}catch (IOException e) {
			e.printStackTrace();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
