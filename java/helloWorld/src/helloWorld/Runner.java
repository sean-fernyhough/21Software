package helloWorld;
// ctrl / makes a comment
// all code should be in { } for our class
public class Runner {

//	we will make a method that prints "Hello World"
// this is our main method 
//	everything in and only in main will run 
	
	public static void main(String[] args) {
//will print out hello world
//		System.out.println("Hello World!");
//		System.out.println("Happy Birthday Reese!");

	helloWorld();
	helloWorld();
	favColor();
	}	
//other methods are created outside of main and then called in main
public static void helloWorld() {
	System.out.println("Hello World!");

}
public static void favColor() {
	System.out.println("My favourite colour is blue");
}
}
