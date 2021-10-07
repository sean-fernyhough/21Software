package com.qa.iteration;

import java.util.Random;

public class IterationMethods {
	public static String spendLimit(int money, int limit) {
		while(money > limit) {
			int spend = new Random().nextInt(80) + 3;
			money -= spend;
			System.out.println("You have £" + money + " left!");
		}
		return "Stop spending money";
	}
	
}
