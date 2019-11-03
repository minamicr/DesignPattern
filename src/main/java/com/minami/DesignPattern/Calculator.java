package com.minami.DesignPattern;

public class Calculator {
	int a;
	int b;
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int subtraction(int a, int b) {
		return a - b;
	}
	
	public static int division (int a, int b) {
		return a / b;
	}

	public static int multiplication (int a, int b) {
		return a * b;
	}
}
