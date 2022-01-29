package com.pranav.designPatterns.structural.decoratorPattern;

public class DiscountCar extends CarDecorator {
	
	public DiscountCar(ICar c) {
		super(c);
	}
	
	public int discountPerc() {
		return 10;
	}
}
