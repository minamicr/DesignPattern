package service.implementation;

import service.IOperation;

public class SubtractionOperation implements IOperation {

	public int calculate(int a, int b) {
		return a - b;
	}

}
