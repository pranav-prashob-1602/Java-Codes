package com.pranav.exception;

import java.util.*;

public class Exception1 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		String s1=null;
		System.out.println("Hello");
		try {
			System.out.println(s1.length());
			System.out.println(5/0);
		}catch(NullPointerException e) {
		    e.printStackTrace();
			System.out.println("NULL POINTER");
		}catch(ArithmeticException e) {
		    e.printStackTrace();
		}catch(Exception e) {
		    e.printStackTrace();
		}
	}
	
}
