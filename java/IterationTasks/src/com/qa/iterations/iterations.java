package com.qa.iterations;

public class iterations {

	public static void flow1() {
		for(int a = 100; a < 201; a++) {
			System.out.println(a);
		}
	}
	
	public static void flow2() {
		for(int a = 100; a <= 200; a++) {
			if(a % 2 == 0) {
			System.out.println("-");
			}else {
				System.out.println("*");
			}
		}
	}
	
	public static void numPrint() {
		for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				System.out.println(b + 1);
			}
		}
		
	}
	
	public static void numPrint2() {
		for(int a = 0; a < 10; a++) {
			System.out.println("");
			for(int b = 0; b < a + 1; b++) {
				System.out.println(a);
			}
		}
		
	}
	
	public static void coins(float cost, float amount) {
		float change = amount - cost;
		int note20 = 0;
		int note10 = 0;
		int note5 = 0;
		int coin200 = 0;
		int coin100 = 0;
		int coin50 = 0;
		int coin20 = 0;
		int coin10 = 0;
		int coin5 = 0;
		int coin2 = 0;
		int coin1 = 0;
		float finalchange = change;
		while(change > 0){
			if(change >= 20) {
				change -= 20;
				note20++;	
			}else if(change >= 10) {
				change -= 10;
				note10++;
			}else if(change >= 5) {
				change -= 5;
				note5++;
			}else if(change >= 2) {
				change -= 2;
				coin200++;
			}else if(change >= 1) {
				change -= 1;
				coin100++;
			}else if(change >= 0.5) {
				change -= 0.5;
				coin50++;
			}else if(change >= 0.2) {
				change -= 0.2;
				coin20++;
			}else if(change >= 0.1) {
				change -= 0.1;
				coin10++;
			}else if(change >= 0.05) {
				change -= 0.05;
				coin5++;
			}else if(change >= 0.02) {
				change -= 0.02;
				coin2++;
			}else if(change >= 0.01){
				change -= 0.01;
				coin1++;
			}else if(change < 0.01) {
				change = 0;
			}
				
	}
	System.out.println("Your change: £" + finalchange);
	System.out.println("You denominations: £20: " + note20 + " £10: " +note10+ " £5: " +note5+ " £2: " +coin200+ " £1: " +coin100+ " 50p: " +coin50+ " 20p: " +coin20+ " 10p: " +coin10+ " 5p: " +coin5+ " 2p: " +coin2+ " 1p: " +coin1);
}
	
//	public static void number(int num) {
//		while(num 
//	}
}
