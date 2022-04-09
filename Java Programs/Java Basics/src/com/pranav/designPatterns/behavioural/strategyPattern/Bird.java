package com.pranav.designPatterns.behavioural.strategyPattern;

public class Bird extends Animal {
	
	Bird() {
		super();
		flyingType = new ItCanFly();
	}
	
	void wings() {
		System.out.println("Drink Red bull");
	}
	
}
