package com.pranav.designPatterns.behavioural.templateMethodPattern;

public class Buyer {

	public static void main(String[] args) {
		ComputerTemplate l = new Laptop();
		l.buildComputer();
		ComputerTemplate s = new Server();
		s.buildComputer();
	}

}
