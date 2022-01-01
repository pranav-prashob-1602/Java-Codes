package com.pranav.designPatterns.creational.builderPattern;

public class Mobile {
	String brand;
	int battery;
	String OS;
	int ram;
	int wgt;
	
	public Mobile(int battery, String brand, String OS, int ram, int wgt) {
		this.battery = battery;
		this.brand = brand;
		this.OS = OS;
		this.ram = ram;
		this.wgt = wgt;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", battery=" + battery + ", OS=" + OS + ", ram=" + ram + ", wgt=" + wgt + "]";
	}
	
}
