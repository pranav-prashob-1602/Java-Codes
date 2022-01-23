package com.pranav.designPatterns.structural.flyWeightPattern;

import java.util.*;

public class VehicleFactory {
	private static HashMap<String, Vehicle> mp = new HashMap<String, Vehicle>();
	
	public static Vehicle getVehicle(String type) {
		Vehicle v = null;
		if(mp.containsKey(type)) {
			v=mp.get(type);
		}else {
			switch(type) {
				case "Car": 
					System.out.println("Car is Created");
					v = new Car();
					break;
				case "Truck":
					System.out.println("Truck is Created");
					v = new Truck();
					break;
				default:
					System.out.println("Vehicle doesn't exist");
			}
			mp.put(type, v);
		}
		return v;
	}
	
}
