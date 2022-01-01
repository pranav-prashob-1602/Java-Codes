package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class MobileFactory extends AbstractDeviceFactory {
	public Device getGadgetName(DeviceType d) {
		switch (d) {
		case NOKIA:
			return new Nokia(1, "330");
		case MOTOROLA:
			return new Motorola(8, "ONE FUSION +");
		default:
			return null;
		}
	}
}
