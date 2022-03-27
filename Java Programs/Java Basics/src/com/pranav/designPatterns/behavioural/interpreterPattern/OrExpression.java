package com.pranav.designPatterns.behavioural.interpreterPattern;

public class OrExpression  implements Expression{
	Expression exp1, exp2;
	
	OrExpression(Expression exp1, Expression exp2) {
		this.exp1=exp1;
		this.exp2=exp2;
	}
	
	public boolean interpreter(String ctx) {
		return exp1.interpreter(ctx) || exp2.interpreter(ctx); 
	}
	
}
