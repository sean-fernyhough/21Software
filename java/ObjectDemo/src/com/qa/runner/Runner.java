package com.qa.runner;

import com.qa.cake.Cake;
import com.qa.animal.Animal;
public class Runner {
public static void main(String[] args) {
	//run the constructor
	//cake is the data type (the object)
	//birthday cake is the new object
//	new Cake(); initialises a new object of type cake
//	Cake birthdayCake = new Cake();
//	System.out.println(birthdayCake.colour);
	
//	Animal snake = new Animal("snake", 0, "hisss", "small", true);
	Animal frog = new Animal("frog", 4, "hisss", "small", false);
	
	System.out.println(snake.legs);
	System.out.println(snake.sound);
	System.out.println(snake.isAnimal);
	System.out.println(frog.isAnimal);
	System.out.println(snake.isAnimal);
	
	
}
}
