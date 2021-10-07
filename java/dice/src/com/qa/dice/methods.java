package com.qa.dice;

import java.util.Random;

public class methods {

	public static int getRandom(int num) {
		
		int total = new Random().nextInt(num);
		return total + 1;
	}
	
	public static int rollDice(int amount, int sides) {
		int total = 0;
		for(int n = 0; n < amount; n++ ) {
			int subtotal = new Random().nextInt(sides);
			subtotal += 1;
			if(subtotal == 1){
				System.out.println("critical failure you rolled a 1");
				n = amount;
				System.exit(0);
			}else if(subtotal == sides) {
				System.out.println("critical sucess");
			}
			total += subtotal;
			subtotal = 0;
//			System.out.println("roll");
		}
		return total;
	}
	
	public static String rollDifferent(int amount1, int sides1, int amount2, int sides2) {
		int total = (rollDice(amount1, sides1) + rollDice(amount2, sides2));
		return "You rolled " + total + " with " + amount1 + " " + sides1 + "-sided dice and " + amount2 + " " + sides2 + "-sided dice";
	}
	
	public static String rollUnique() {
		int total = (rollDice(1,2) + rollDice(1,3) + rollDice(1,4) + rollDice(1,5) + rollDice(1,6) + rollDice(1,8));
		return "You rolled " + total + " with 1 of each die";
	}

	public static String rollDiceVerbose(int amount, int sides) {
		int total = 0;
		for(int n = 0; n < amount; n++ ) {
			int subtotal = new Random().nextInt(sides);
			subtotal += 1;
			if(subtotal == 1){
				System.out.println("critical failure you rolled a 1");
				n = amount;
				System.out.println("critical failure you rolled a 1");
				System.exit(0);
				
			}else if(subtotal == sides) {
				System.out.println("critical sucess");
			}
			total += subtotal;
			subtotal = 0;
//			System.out.println("roll");
		}
		return "You rolled " + total + " with " + amount + " " + sides + "-sided dice";
	}
	
}



