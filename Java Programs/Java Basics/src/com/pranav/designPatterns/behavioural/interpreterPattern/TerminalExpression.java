package com.pranav.designPatterns.behavioural.interpreterPattern;

public class TerminalExpression implements Expression {
	String data;
	
	TerminalExpression(String data) {
		this.data = data;
	}
	
	public boolean interpreter(String ctx) {
		return ctx.contains(data);
	}
}
