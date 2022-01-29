package com.pranav.designPatterns.structural.bridgePattern;

public class Car extends Automobile {
	
	public Car(Workshop w1, Workshop w2) {
		super(w1, w2);
	}
	
	public void manuf() { 
		System.out.println("Manufacturing Car");
		w1.work();
		w2.work();
	}
	
}
