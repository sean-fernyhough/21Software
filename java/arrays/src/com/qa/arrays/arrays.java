package com.qa.arrays;

public class arrays {

	public static void arrayDemo() {
		
		//creates array with values
		String[] nameArray = {"sean", "Mike", "john"};
		
		//creates empty array with a length of 4
		int[] numArray = new int[4];
		numArray[0] = 2;
		
		System.out.println(nameArray[1]);
		System.out.println(numArray[0]);
		
		char[] favLetter = {'q', 'w', 'e', 'r'};
		boolean[] canDrive = {true, false, true, true};
		
		System.out.println(canDrive[1]);
		System.out.println(favLetter[0]);
	}
	
}
