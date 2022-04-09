package com.pranav.designPatterns.behavioural.strategyPattern;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal d = new Dog();
		d.setName("Shiro");
		d.setAge(6);
		d.setHeight(120);
		System.out.println(d.getName() + ": "+ d.tryToFly());
		d.setFlyingType(new ItCanFly());
		System.out.println(d.getName() + ": "+ d.tryToFly());
		Animal b = new Bird();
		b.setName("Chirpy");
		b.setAge(1);
		b.setHeight(30);
		System.out.println(b.getName() + ": "+ b.tryToFly());
	}

}
