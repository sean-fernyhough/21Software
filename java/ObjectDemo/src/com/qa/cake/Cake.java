package com.qa.cake;

public class Cake {

	// class level variables
	// attributes / fields of our class
	
	public String filling;
	
	public int tiers;
	
	public String colour;
	
	public boolean icing;
	
	// a constructor to create a cake object from our class
	// this is the method that is called from the main
	
	public Cake() {
		
		//defining the properties of cake
		this.filling = "buttercream";
		this.tiers = 2;
		this.colour = "White";
		this.icing = true;
	}
}
