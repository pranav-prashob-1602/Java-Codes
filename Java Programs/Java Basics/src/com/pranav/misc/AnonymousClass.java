package com.pranav.misc;

interface A {
	void print();
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		//Here we are NOT instantiating the Interface, we are making a Class which is implementing the Interface.
		A obj=new A() {
						public void print() {
							System.out.println("Inside Anonymous class");
						}
				  };
//        A obj1=new A() {
//						public void print() {
//							System.out.println("Inside Anonymous class");
//						}
//				  };
	    obj.print();
	}

}
