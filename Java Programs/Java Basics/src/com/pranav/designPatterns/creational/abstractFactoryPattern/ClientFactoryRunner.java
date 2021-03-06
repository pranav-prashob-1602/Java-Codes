package com.pranav.designPatterns.creational.abstractFactoryPattern;

public class ClientFactoryRunner {

	public static void main(String[] args) {
		Device d = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadgetName(DeviceType.DELL);
		System.out.println(d.getDetails());
		
		Device d1 = FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadgetName(DeviceType.HP);
		System.out.println(d1.getDetails());
		
		Device d2 = FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getGadgetName(DeviceType.MOTOROLA);
		System.out.println(d2.getDetails());
		
	}

}
