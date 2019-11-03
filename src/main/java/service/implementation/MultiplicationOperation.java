package service.implementation;

import service.IOperation;

public class MultiplicationOperation implements IOperation {

	public int calculate(int a, int b) {
		return a * b;
	}

}
