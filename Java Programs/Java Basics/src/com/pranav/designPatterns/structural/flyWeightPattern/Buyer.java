package com.pranav.designPatterns.structural.flyWeightPattern;

public class Buyer {
	public static void main(String[] args) {
		Vehicle v1 = VehicleFactory.getVehicle("Car");
		v1.assignColor("Blue");
		v1.startEngine();
		v1.assignColor("Rust Orange");
		v1.startEngine();
		
		Vehicle v2 = VehicleFactory.getVehicle("Truck");
		v2.assignColor("Black");
		v2.startEngine();
		v2.assignColor("Red");
		v2.startEngine();
		
	}
}
