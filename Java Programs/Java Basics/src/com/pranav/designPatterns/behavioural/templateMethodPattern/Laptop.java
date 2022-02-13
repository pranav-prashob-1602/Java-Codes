package com.pranav.designPatterns.behavioural.templateMethodPattern;

public class Laptop extends ComputerTemplate{
	public void assembleComponents() {
		System.out.println("Computer is Assembled");
	}
	
	public void installOS() {
		System.out.println("OS was installed after 10 years");
	}
}
