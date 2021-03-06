package com.pranav.exception;

import java.io.IOException;
import java.util.*;

public class Bank {

	void inputWd() throws IOException, CloneNotSupportedException {
//		try {
			throw new IOException("Device Error");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	}
	
	void balanceWd() throws IOException, CloneNotSupportedException, Exception {
	    inputWd();
	}
	
	public static void main(String[] args) {
		
		int balance=5000;
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		int wd = sc.nextInt();
		
		try {
			b.inputWd();			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			b.balanceWd();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("THE PROGRAM ENDS HERE");
		}
		
		try {
			if(balance<wd) {
				throw new ArithmeticException("Insufficient Balance!");
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		balance-=wd;
		System.out.println("Withdrawal amount : "+wd);
		
		try {
			throw new RuntimeException();
		}finally {
			System.out.println("THE PROGRAM SHOULD HAVE ENDED BY NOW");
		}
		
	}
}
