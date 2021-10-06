package com.qa.calc;

public class Runner {

	public static void main(String[] args) {
		System.out.println(calc.plus(2, 2));
		System.out.println(calc.minus(2, 1));
		System.out.println(calc.multiply(2, 8));
		System.out.println(calc.divide(9, 3));
		System.out.println(calc.modulo(10, 4));
		
		System.out.println(calc.power(10, 3));
	}
	
}
