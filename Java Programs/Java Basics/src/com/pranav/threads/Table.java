package com.pranav.threads;

public class Table {
	
	//  When more than one threads are accessing a synchronized block/method,
	//  they should acquire the same object lock.
	
	public void display(int a) {
		synchronized(this) {		// THIS IS A SYNCHRONIZED BLOCK
			for(int i=1;i<11;i++) {
				System.out.println(i*a);
			}
		}
	}
	
	public synchronized void display1(int a) {		// THIS IS A SYNCHRONIZED FUNCTION
			for(int i=1;i<11;i++) {
				System.out.println(i*a);
			}
	}
	
	public synchronized static void display2(int a) {		// THIS IS A SYNCHRONIZED FUNCTION FOR STATIC FUNCTION
//		class Class = new class();
		 
		for(int i=1;i<11;i++) {
			System.out.println(i*a);
		}
	}
	
	public static void display3(int a) {
		synchronized(Table.class) {		// THIS IS A SYNCHRONIZED BLOCK FOR STATIC FUNCTION
			for(int i=1;i<11;i++) {
				System.out.println(i*a);
			}
		}
	}
	
}
