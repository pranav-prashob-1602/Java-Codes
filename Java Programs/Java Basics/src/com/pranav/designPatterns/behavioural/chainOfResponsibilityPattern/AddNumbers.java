package com.pranav.designPatterns.behavioural.chainOfResponsibilityPattern;

public class AddNumbers implements Chain{
	private Chain nc;
	
	public void setNextChain(Chain c) {
		nc = c;
	}
	
	public void calculate(Numbers req) {
		if(req.getCalculationWanted() == "add") {
			System.out.println(req.getN1() + " " + req.getN2() + "\nResult : " + (req.getN1()+req.getN2()));
		}else {
			nc.calculate(req);
		}
	}
	
}
