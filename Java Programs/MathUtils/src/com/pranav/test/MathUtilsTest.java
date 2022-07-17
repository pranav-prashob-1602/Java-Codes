package com.pranav.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.pranav.calculator.MathUtils;

/*
 * If I use @TestInstance(TestInstance.Lifecycle.PER_CLASS)
 * Then I won't have to specify the @BeforeAll and @AfterAll hook annotations as static.
 * As only one instance will be created instead of one for each method.
 */


@TestInstance(TestInstance.Lifecycle.PER_CLASS)		//	Only one instance per class instead of one per method.
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	/*
	 * Four types of hook annotations:
	 * 	1. @BeforeAll : Executed before any test runs, has to be a static method as JUnit creates 
	 * 					instance every single time a test runs, as this runs before any tests, no 
	 * 					instance is created and hence can't be a non-static function.
	 * 	
	 * 	2. @AfterAll : Executed After all tests are run, has to be a static method (same reason as above).
	 * 	
	 * 	3. @BeforeEach : Executed before running every single test.
	 * 
	 * 	4. @AfterEach : Executed after running every single test.
	 */
	
//	@BeforeAll
//	static void beforeAllInit() {
//		System.out.println("This needs to be run before all.");
//	}
	
	@BeforeAll
	void beforeAllInit() {
		System.out.println("This needs to be run before all.");
	}
	
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleaup() {
		System.out.println("Cleaning up..:)");
	}
	
	@Test
	final void should_check_if_addition_is_correct() {
//		MathUtils mathUtils = new MathUtils();
		
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
	
	@Test
	final void should_verify_cicle_radius() {
//		MathUtils mathUtils = new MathUtils();
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return the correct circle area");
	}
	
	@Test
	final void should_throw_exception_when_divide_by_zero() {
//		MathUtils mathUtils = new MathUtils();
//		assertThrows(NullPointerException.class, ()-> mathUtils.divide(1, 0), "Divide by zero should throw exception");

		assertThrows(ArithmeticException.class, ()-> mathUtils.divide(1, 0), "Divide by zero should throw exception");
		
	}
	

}
