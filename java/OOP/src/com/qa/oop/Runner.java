package com.qa.oop;

import org.w3c.dom.TypeInfo;

import com.qa.model.Sim;

public class Runner {
	public static void main(String[] args) {
		Sim steve = new Sim("steve", "artist", 2000f, false, 6);
		System.out.println(steve.name + steve.hunger);
		
		
		
	}
}

