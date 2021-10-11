package com.qa.encap;

import com.qa.interfaces.Camouflage;
import com.qa.interfaces.Spend;

public class Coin extends Item implements Camouflage, Spend {

	@Override
	public String pickup() {
		return "you picked up a coin";
	}

	@Override
	public String inspect() {
		return "shiny";
	}

	@Override
	public void camouflage() {
		System.out.println("where'd the coin go ?!?!?");
		
	}
	
	@Override
	public void spend() {
		System.out.println("high roller");
	}

}
