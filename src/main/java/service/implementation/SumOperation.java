package service.implementation;

import service.IOperation;

public class SumOperation implements IOperation{

	public int calculate(int a, int b) {
		return a + b;
	}

}
