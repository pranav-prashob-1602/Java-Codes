package com.pranav.designPatterns.behavioural.chainOfResponsibilityPattern;

public interface Chain {
	void setNextChain(Chain nextChain);
	void calculate(Numbers request);
}
