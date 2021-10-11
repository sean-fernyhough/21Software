package com.qa.encap;

public class Sword extends Weapon {

	String type;
	float weight;
	
	public Sword(int damage, String name, float cost, String type, float weight) {
		super(damage, name, cost);
		this.type = type;
		this.weight = weight;
	}

	
	@Override
	public String attack() {
		return "whoosh";
	}
	
	@Override
	public String toString() {
		return "Sword [type=" + type + ", weight=" + weight + ", damage=" + damage + ", name=" + name + ", cost=" + cost
				+ "]";
	}
	
	
	
	
	
}
