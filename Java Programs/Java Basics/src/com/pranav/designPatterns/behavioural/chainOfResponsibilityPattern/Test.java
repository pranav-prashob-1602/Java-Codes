package com.pranav.designPatterns.behavioural.chainOfResponsibilityPattern;

public class Test {

	public static void main(String[] args) {
		Chain c1  = new AddNumbers();
		Chain c2  = new SubNumbers();
		Chain c3  = new ErrorMessage();
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		Numbers n = new Numbers(5, 10, "mul");
		c1.calculate(n);
	}

}
