package com.qa.methods;

public class meethods {

	
	public static void arrayRead() {
	String[] foods = {"taco", "sausage", "curry"};
	System.out.println(foods[2]);
	}

	public static void squareArray() {
		int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int newint = 0;
		int[] numArray2 = new int[10];
		for(int i = 0; i < numArray.length; i++) {
			newint = numArray[i] * numArray[i];
			System.out.println(newint);
			numArray2[i] = newint;
		}
		
		int[] numArrayReverse = new int[10];
		int a = 0;
		for(int i = numArray.length - 1; i > 0 ; i--) {
			newint = numArray[i] * numArray[i];
			System.out.println(newint);
			numArrayReverse[a] = newint;
			a++;
		}
		System.out.println(numArrayReverse[0]);
	}
	
}
