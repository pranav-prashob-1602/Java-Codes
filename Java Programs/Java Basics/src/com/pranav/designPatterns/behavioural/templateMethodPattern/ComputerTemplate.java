package com.pranav.designPatterns.behavioural.templateMethodPattern;

public abstract class ComputerTemplate {
	public final void buildComputer() {
		collectComponents();
		assembleComponents();
		installOS();
		startComputer();
		System.out.println("Computer is Ready!");
	}
	
	private void collectComponents() {
		System.out.println("Computer with 4GB/1 TB SSD");
	}
	
	abstract void assembleComponents();
	
	abstract void installOS();
	
	private void startComputer() {
		System.out.println("system is booting and then Weird noises");
	}
	
}
