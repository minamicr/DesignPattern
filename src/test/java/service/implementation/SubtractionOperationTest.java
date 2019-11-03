package service.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SubtractionOperationTest {
	private SubtractionOperation subtraction = new SubtractionOperation();

	@Test
	public void subtracteNumbers() {
		int a = 8;
		int b = 4;
		
		int result = subtraction.calculate(a, b);
		
		Assertions.assertEquals(4, result);
	}

}
