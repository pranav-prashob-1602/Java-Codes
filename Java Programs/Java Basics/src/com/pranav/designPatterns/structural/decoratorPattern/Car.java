package com.pranav.designPatterns.structural.decoratorPattern;

public class Car {

	public static void main(String[] args) {
		ICar c = new McLaren();
		CarDecorator cd = new DiscountCar(c);
		System.out.println(cd.make());
		System.out.println(cd.getPrice());
		System.out.println(cd.discountPerc());
	}

}
