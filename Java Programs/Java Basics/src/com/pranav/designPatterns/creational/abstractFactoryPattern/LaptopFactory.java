package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class LaptopFactory extends AbstractDeviceFactory {
	public Device getGadgetName(DeviceType d) {
		switch (d) {
		case DELL:
			return new Dell(8, "XPS");
		case HP:
			return new HP(8, "OMEN");
		default:
			return null;
		}
	}
}
