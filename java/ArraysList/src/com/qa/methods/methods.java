package com.qa.methods;

import java.util.ArrayList;

public class methods {
	
	public static void enhancedForLoop() {
		String[] pizzas = {"pepperoni", "meat feast"};
		for(int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i]);
		}
		
//		This is a for each loop, only for arrays and can only iterate through them forwards
		for(String pizza : pizzas) {
			System.out.println(pizza);
		}
	}
	
	
	public static void arrayListDemo() {
//		defining an array list, ArrayList<datatyoe> object name = new ArrayList<>();
		ArrayList<String> pizzaList = new ArrayList<>();
		System.out.println(pizzaList);
		pizzaList.add("american hot");
		pizzaList.add("pineapple");
		System.out.println(pizzaList);
		ArrayList<String> pizzaList2 = pizzaList;
		pizzaList2.addAll(pizzaList2);
		System.out.println(pizzaList2);
		pizzaList2.add(1, "curry");
		System.out.println(pizzaList2);
		//many commands .add(), .remove(), .size(), .set() etc
	}
	
}
