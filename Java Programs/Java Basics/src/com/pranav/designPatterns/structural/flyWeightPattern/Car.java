package com.pranav.designPatterns.structural.flyWeightPattern;

public class Car implements Vehicle {
	private String color;		// Extrinsic Property
	private final int maxSpeed;			// Intrinsic Property
	
	Car() {
		maxSpeed = 150;
	}
	
	public void assignColor(String c) {
		color=c;
	}
	
	public void startEngine() {
		System.out.println(color+" "+"Car engine started with max speed of "+maxSpeed);
	}
}
