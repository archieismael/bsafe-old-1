package com.aetna.bsafe;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private BsafeApplication calculator = new BsafeApplication(); 
	@Test     
	public void testSum() {          
		assertEquals(5, calculator.sum(2, 3));     
	}
}
