package service.implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionOperationTest {
	private DivisionOperation division = new DivisionOperation();
	
	
	@Test
	@DisplayName("Resultado da divisão 8 / 4")
	public void divideNumbers() {
		//cenario
		int a = 8;
		int b = 4;
		
		//ação
		int result = division.calculate(a, b);
		
		//resultado
		Assertions.assertEquals(2, result);
	}

}
