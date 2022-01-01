package com.pranav.designPatterns.creational.builderPattern;

public class MobileBuilder {
	String brand;
	int battery;
	String OS;
	int ram;
	int wgt;
	
	
	public MobileBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}


	public MobileBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}


	public MobileBuilder setOS(String OS) {
		this.OS = OS;
		return this;
	}


	public MobileBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}


	public MobileBuilder setWgt(int wgt) {
		this.wgt = wgt;
		return this;
	}


	public Mobile getMobile() {
		return new Mobile(battery, brand, OS, ram, wgt);
	}
}
