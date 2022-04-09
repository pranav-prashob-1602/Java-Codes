package com.pranav.designPatterns.behavioural.strategyPattern;

public class Dog extends Animal{
	
	Dog() {
		super();
		flyingType = new ItCantFly();
	}
	
	void bark() {
		System.out.println("Barking");
	}
}
