package com.pranav.designPatterns.behavioural.chainOfResponsibilityPattern;

public class ErrorMessage implements Chain{
	private Chain nc;
	
	public void setNextChain(Chain c) {
		nc = c;
	}
	
	public void calculate(Numbers req) {
		System.out.println("This program can only perform Addition and subtraction");
	}
	
}

