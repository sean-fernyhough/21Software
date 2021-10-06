package parameters;

public class Runner {

	public static void main(String[] args) {

		System.out.println(hello("Sean"));
		multiMethod("sean", 24, true );
	}
	
	
	public static String hello(String name) {
		String greeting = "Hello " + name;
		return greeting;
	}
	
	public static void multiMethod(String name, int age, boolean bool) {
	System.out.println(name + age + bool);
	return;
	}
}
