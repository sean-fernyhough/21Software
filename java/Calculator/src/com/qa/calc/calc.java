package com.qa.calc;

public class calc {

public static int plus(int num1, int num2) {	
	return num1 + num2;
}
	public static int minus(int num1, int num2) {	
		return num1 - num2;	
	}		
	public static int divide(int num1, int num2) {	
		return num1 / num2;	
	}
	public static int multiply(int num1, int num2) {	
		return num1 * num2;	
	}
	public static int modulo(int num1, int num2) {
		return num1 % num2;
	}
	
//	public static int power(int num1, int num2) {
//		
//		int result = 1;
//		
//		for (int i = 0; i < num2; i++ ) {
//			result *= num1;
//		}
//		return result;
//	}

	public static int power(int num1, int num2) {
		return (int) (Math.pow(num1, num2));
	}
	
	
}