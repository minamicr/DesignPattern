package service.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOperationTest {
	private SumOperation sum = new SumOperation();
	
	@Test
	public void sumNumbers() {
		int a = 8;
		int b = 4;
		
		int result = sum.calculate(a, b);
		Assertions.assertEquals(12, result);
	}

}
