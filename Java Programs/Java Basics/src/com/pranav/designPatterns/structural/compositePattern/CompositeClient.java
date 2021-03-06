package com.pranav.designPatterns.structural.compositePattern;

public class CompositeClient {
	public static void main(String[] a) {
		Component hdd = new Leaf("HDD", 4000);
		Component mouse = new Leaf("Mouse", 1500);
		Component monitor = new Leaf("Monitor", 6000);
		Component ram = new Leaf("RAM", 8000);
		Component cpu = new Leaf("CPU", 10000);
		
		
		Composite perip = new Composite("Peripherals");
		Composite cab = new Composite("Cabinet");
		Composite motherboard = new Composite("Motherboard");
		Composite computer = new Composite("Computer");
		
		perip.addComponent(mouse);
		perip.addComponent(monitor);
		
		motherboard.addComponent(cpu);
		motherboard.addComponent(ram);
		
		cab.addComponent(hdd);
		cab.addComponent(motherboard);
		
		computer.addComponent(perip);
		computer.addComponent(cab);
		
		ram.showPrice();
		mouse.showPrice();
		System.out.println();
		perip.showPrice();
		System.out.println();
		computer.showPrice();
		
	}
}
