package com.pranav.misc;

public class Car implements Vehicle, FourWheeler{

	public int seat() {
		return 4;
	}
	//If there's a class(that is being extended) and an interface(that is being implemented) have the same function
	//then there's no need to override the function in the child class as the super class will hold more power over the interface
	//and the function definition from the super class will be considered.
	public void print() {
		System.out.println("Inside Car class");
	}
	
	public static void main(String[] args) {
		Vehicle c = new Car();
		Vehicle.speed();
		c.print();
	}

}
