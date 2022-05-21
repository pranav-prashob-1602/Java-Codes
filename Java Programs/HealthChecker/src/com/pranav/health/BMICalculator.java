package com.pranav.health;

public class BMICalculator {
	
	public static final double THRESHOLD = 25.0;
	
	public static boolean isDietRecommended(double w, double h) {
		if(h==0) {
			throw new ArithmeticException("Divide by 0");
		}
		double bmi = w/(h*h);
//		System.out.println(bmi);
		return (bmi>=THRESHOLD);
	}
	
}
