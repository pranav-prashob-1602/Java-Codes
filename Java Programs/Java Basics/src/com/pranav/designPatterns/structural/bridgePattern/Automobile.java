package com.pranav.designPatterns.structural.bridgePattern;

public class Automobile {
	protected Workshop w1, w2;
	
	public Automobile(Workshop w1, Workshop w2) {
		this.w1 = w1;
		this.w2 = w2;
	}
	
	public void manuf() {
		System.out.println("In Automobile");
	}
	
}
