package com.qa.encap;

public abstract class Item {
	
	public abstract String pickup();
	
	public abstract String inspect();
	
	public String bite() {
		return "ouch... thats tough";
	}

}
