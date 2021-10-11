package com.qa.encap;

public class Weapon {
	
	
	public int damage;
	public String name;
	public float cost;
	
	public String attack() {
		return "you did " + damage + " damage!";
	}
	
	public String sell() {
		return "You sold your " + name + " for $" + cost + "!";
	}
	
	public Weapon(int damage, String name, float cost) {
		this.damage = damage;
		this.name = name;
		this.cost = cost;
	}
}
