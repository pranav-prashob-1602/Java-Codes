package com.pranav.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pranav.calculator.MathUtils;

class MathUtilsTest {

	@Test
	final void should_check_if_addition_is_correct() {
		MathUtils mathUtils = new MathUtils();
		
//		Given:
		int expected, a, b;
		expected = 23;
		a = 12;
		b = 11;
		
//		When:
		int exp_result = mathUtils.add(a, b);
		
//		Then:
		assertEquals(expected, exp_result, "This method should add two numbers");
		
	}

}
