package service.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplicationOperationTest {
	private MultiplicationOperation multiplication = new MultiplicationOperation();
	
	@Test
	@DisplayName("Resultado da multiplicação 8 * 4")
	public void multiplicateNumbers() {
		//cenário
		int a = 8;
		int b = 4;
		
		//ação
		int result = multiplication.calculate(a, b);
		
		//teste
		Assertions.assertEquals(32,  result);
	}

}
