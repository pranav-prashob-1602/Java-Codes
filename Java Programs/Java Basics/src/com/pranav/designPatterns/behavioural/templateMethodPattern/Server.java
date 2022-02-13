package com.pranav.designPatterns.behavioural.templateMethodPattern;

public class Server extends ComputerTemplate {
	public void assembleComponents() {
		System.out.println("Joining all Units");
	}
	
	public void installOS() {
		System.out.println("Installing Ubuntu");
	}
}
