package com.pranav.designPatterns.behavioural.interpreterPattern;

public class InterpreterRunner {

	public static void main(String[] args) {
		Expression person1 = new TerminalExpression("ABC");
		Expression person2 = new TerminalExpression("C");
		Expression person3 = new TerminalExpression("ABCDE");
		Expression committed = new TerminalExpression("CDE");
		

		Expression isSingle = new OrExpression(person1, person2);
		System.out.println(isSingle.interpreter("D"));
		
		Expression isCommitted = new AndExpression(person3, committed);
		System.out.println(isCommitted.interpreter("ABCDEF"));
		
	}

}
