package com.qa.animal;

public class Animal {
	public String name;
	public int legs;
	public String sound;
	public String size;
	public static boolean isAnimal;
	
	
	private Animal(String n, int l, String so, String si, boolean isAnimal) {
		this.name = n;
		this.legs = l;
		this.sound = so;
		this.size = si;
		this.isAnimal = isAnimal;
	}
	
	Animal snake = new Animal("snake", 0, "hisss", "small", true);
	public Animal returnanimal() {
		return snake;
	}
}
