package com.pranav.misc;

public class MyClassRunner {

	public static void main(String[] args) throws Exception{
		MyClass m = new MyClass();
		if(m instanceof InterfaceP) {
			m.setX(0);
			m.display();
		}else {
			throw new Exception("Not Permitted");
		}
	}

}
