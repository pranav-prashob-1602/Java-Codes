package com.pranav.misc;

interface B {
	void print(int x);
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		//Lambda Expression!!
		
		B obj=(int x) -> System.out.println("Inside LambdaExpressions "+x);
		obj.print(5);
	}

}
