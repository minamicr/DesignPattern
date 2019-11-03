package com.minami.DesignPattern;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTest {
	///private Calculator calculator;
	
	@Test
	public void sumTest() {
		//cenário
		
		//ação
		int result = Calculator.sum(8, 4);
		
		//resultado
		Assertions.assertEquals(12, result);
		
	}
	
	@Test
	public void divisionTest() {
		int result = Calculator.division(8,  4);
		
		Assertions.assertEquals(2, result);
	}
	
	@Test
	public void multiplicationTest() {
		int result = Calculator.multiplication(8,  4);
	
		Assertions.assertEquals(32, result);
		
	}
	
	@Test
	public void subtractionTest() {
		int result = Calculator.subtraction(8,  4);
		
		Assertions.assertEquals(4, result);
		
		
	}
}
