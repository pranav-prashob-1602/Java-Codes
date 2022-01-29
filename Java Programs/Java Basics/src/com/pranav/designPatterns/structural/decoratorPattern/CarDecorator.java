package com.pranav.designPatterns.structural.decoratorPattern;

public abstract class CarDecorator implements ICar {
	private ICar c;
	
	public abstract int discountPerc();
	
	public CarDecorator(ICar c) {
		this.c = c;
	}
	
	public String make() {
		return c.make();
	}
	
	public int getPrice() {
		return c.getPrice();
	}
	
}
