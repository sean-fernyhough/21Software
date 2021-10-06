package com.qaconditionalTasks;

public class methods {

	public static void task(int num1, int num2, boolean op) {
		if (op) {
			System.out.println(num1 + num2);
		} else {
			System.out.println(num1 * num2);
		}
	}

	public static void flow(int a) {
		if (a > 2000) {
			System.out.println("1");
			if (a > 100) {
				System.out.println("2");
			} else {
				System.out.println("3");
				if (a > 600) {
					System.out.println("4");
					if (a > 500) {
						System.out.println("7");
					} else {
						System.out.println("6");
					}
				} else {
					System.out.println("5");
				}
			}

		} else {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			} else {
				System.out.println("C");
			}

		}

	}

	public static void blackjack(int num1, int num2) {
		if (num1 == 21) {
			System.out.println(num1);
		} else if (num2 == 21) {
			System.out.println(num2);
		} else if (num1 < 21 && num2 < 21) {
			if (num1 > num2) {
				System.out.println(num1);
			} else {
				System.out.println(num2);
			}
		} else if (num1 < 21) {
			System.out.println(num1);
		} else if (num2 < 21) {
			System.out.println(num2);
		} else {
			System.out.println(0);
		}
	}

	public static void fizzbuzz(int num) {
		if (num % 5 == 0 && num % 3 == 0) {
			System.out.println("FizzBuzz");
			;
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else {
			System.out.println(num);
		}
	}

	public static void taxes(int salary) {
		if (salary < 15000) {
			System.out.println(salary);
		} else if (salary < 20000) {
			System.out.println(salary * 0.9);
		} else if (salary < 30000) {
			System.out.println(salary * 0.85);
		} else if (salary < 45000) {
			System.out.println(salary * 0.8);
		} else {
			System.out.println(salary * 0.75);
		}
	}

	public static void switchcaseDemo(int value) {
		switch(value) {
		case 1:
			System.out.println("single");
			break;
		case 2:
			System.out.println("double");
			break;
		case 3:
			System.out.println("triple");
			break;
		case 4:
			System.out.println("qaudruple");
			break;
		case 5:
			System.out.println("quintuple");
			break;
		default:
			System.out.println("Please enter a number between 1 - 5");
		
		}
	}

	public static void days(int value) {
		switch(value){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter a number < 8");
		}
	}
	
	public static void taxesSwitch(int salary) {
		int taxBand = 0;
		if (salary < 15000) {
			taxBand = 1;
		} else if (salary < 20000) {
			taxBand = 2;
		} else if (salary < 30000) {
			taxBand = 3;
		} else if (salary < 45000) {
			taxBand = 4;
		} else {

			taxBand = 5;
		}
		
		switch(taxBand){
		case 1:
			System.out.println(salary * 0);
			System.out.println(salary);
			break;
		case 2:
			System.out.println(salary * 0.1);
			System.out.println(salary * 0.9);
			break;
		case 3:
			System.out.println(salary * 0.15);
			System.out.println(salary * 0.85);
			break;
		case 4:
			System.out.println(salary * 0.2);
			System.out.println(salary * 0.8);
			break;
		case 5:
			System.out.println(salary * 0.25);
			System.out.println(salary * 0.75);
			break;
		}
	}
	
	

}
