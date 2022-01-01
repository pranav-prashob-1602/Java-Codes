package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class FactoryGenerator {
	static AbstractDeviceFactory getFactory(FactoryType fact) {
		switch(fact) {
		case LAPTOPFACTORY:
			return new LaptopFactory();
		case MOBILEFACTORY:
			return new MobileFactory();
		default:
			return null;
		}
	}
}
