package com.pranav.designPatterns.structural.flyWeightPattern;

public class Truck implements Vehicle {
	private String color;		// Extrinsic Property
	private final int maxSpeed;			// Intrinsic Property
	
	Truck() {
		maxSpeed = 100;
	}
	
	public void assignColor(String c) {
		color=c;
	}
	
	public void startEngine() {
		System.out.println(color+" "+"Truck engine started with max speed of "+maxSpeed);
	}
	
}
