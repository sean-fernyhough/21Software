
public class methods {

	public static void stepCounter(int steps) {
		System.out.println("You have taken " + steps + " steps!");
	}

	public static void namePrint(String name) {
		System.out.println("Your name is " + name);
	}

	public static void balance(float amount) {
		System.out.println("Your current balance is: £" + amount);
	}

	public static void energyCredit(float credit, boolean isPositive) {
		System.out.println("Do you have remaining credit: " + isPositive);
		System.out.println("Your remaining credit is: " + credit);
	}
	
	public static void height(String name, float height) {
		System.out.println("Hello " + name + ", You are " + height + "m tall");
	}

	public static void occurance(char letter, boolean bool, int num) {
		System.out.println(letter + " appears " + num + " time(s): " + bool);
	}
	
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	
}
