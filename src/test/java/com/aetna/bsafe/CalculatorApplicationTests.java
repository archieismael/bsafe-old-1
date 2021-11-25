package com.simplilearn.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private CalculatorApplication calculator = new CalculatorApplication(); 
	@Test     
	public void testSum() {          
		assertEquals(5, calculator.sum(2, 3));     
	}
}

