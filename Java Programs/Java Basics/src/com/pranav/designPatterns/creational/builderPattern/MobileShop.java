package com.pranav.designPatterns.creational.builderPattern;

public class MobileShop {

	public static void main(String[] args) {
		MobileBuilder m = new MobileBuilder();
		m.setBrand("Apple");
		m.setRam(8);
		System.out.println(m.getMobile());
	}

}
