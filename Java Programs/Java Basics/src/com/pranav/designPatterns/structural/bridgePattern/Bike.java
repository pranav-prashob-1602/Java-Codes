package com.pranav.designPatterns.structural.bridgePattern;

public class Bike extends Automobile {
	
	public Bike(Workshop w1, Workshop w2) {
		super(w1, w2);
	}
	
	public void manuf() { 
		System.out.println("Manufacturing Bike");
		w1.work();
		w2.work();
	}
}
