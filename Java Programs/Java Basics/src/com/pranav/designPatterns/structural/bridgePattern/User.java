package com.pranav.designPatterns.structural.bridgePattern;

public class User {

	public static void main(String[] args) {
		Automobile c = new Car(new Produce(), new Assemble());
		c.manuf();
		
		Automobile b = new Bike(new Produce(), new Assemble());
		b.manuf();
	}

}
