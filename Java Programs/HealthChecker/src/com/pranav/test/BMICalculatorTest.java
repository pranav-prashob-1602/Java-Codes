package com.pranav.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.pranav.health.BMICalculator;

class BMICalculatorTest {

	@Test
	final void should_return_True_if_diet_recommended() {
//		assertTrue(BMICalculator.isDietRecommended(89, 1.72));
//		assertFalse(BMICalculator.isDietRecommended(89, 1.72));
		
//		Given:
		double weight, height;
		weight = 89;
		height = 1.72;
		
//		When:
		boolean exp_result = BMICalculator.isDietRecommended(weight, height);
		
//		Then:
		assertTrue(exp_result);
		
	}
	
	@Test
	final void should_return_false_if_diet_not_recommended() {
		
//		Given:
		double weight, height;
		weight = 60;
		height = 1.9;
		
//		When:
		boolean exp_result = BMICalculator.isDietRecommended(weight, height);
		
//		Then:
		assertFalse(exp_result);
		
	}
	
	@Test
	final void should_throw_arithmetic_expception_when_height_0() {
		
//		Given:
		double weight, height;
		weight = 89;
		height = 0;
		
//		When:
		Executable executable = () -> BMICalculator.isDietRecommended(weight, height);
		
//		Then:
		assertThrows(ArithmeticException.class, executable);
		
	}
	

}
