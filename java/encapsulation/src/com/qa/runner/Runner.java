package com.qa.runner;

import com.qa.encap.Coin;
import com.qa.encap.Gun;
import com.qa.encap.Sword;

public class Runner {

	public static void main(String[] args) {
		Gun colt = new Gun(20, "colt", "pistol", 0.45f, false, 2000f, "Colt");
		Gun m4 = new Gun(5, "m4", "rifle", 0.45f, false, 2000f, "Colt");
		Sword buster = new Sword(30, "buster", 1500f, "long sword", 20f);
	
		colt.setCalibre(5.56f);
		System.out.println(colt.getCalibre());
		System.out.println(colt.attack());
		System.out.println(m4.attack());
		System.out.println(colt.sell());
		System.out.println(buster.sell());
		System.out.println(buster.attack());
		
		Coin penny = new Coin();
		System.out.println(penny.inspect());
		System.out.println(penny.bite());
	}
	
}
