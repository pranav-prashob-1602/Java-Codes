package com.pranav.designPatterns.creational.factoryPattern;

public class OSFactory {
	public OS getInstance(String OSName) {
		if(OSName=="Linux") {
			return new Linux();
		}else if(OSName=="Windows") {
			return new Windows();
		}else if(OSName=="IOS"){
			return new IOS();
		}
		return null;
	}
}
