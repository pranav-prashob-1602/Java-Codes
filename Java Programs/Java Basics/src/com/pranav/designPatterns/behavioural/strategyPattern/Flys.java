package com.pranav.designPatterns.behavioural.strategyPattern;

public interface Flys {
	String fly();
}

class ItCanFly implements Flys {
	public String fly() {
		return "It can Fly";
	}
}

class ItCantFly implements Flys {
	public String fly() {
		return "It can't Fly";
	}
}

