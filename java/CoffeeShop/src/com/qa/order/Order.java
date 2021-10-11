package com.qa.order;

import java.util.ArrayList;

public class Order {
	
	
	private String size;
	private String type;
	private String optional;
	
	
	public Order(String size, String type) {
		this.size = size;
		this.type = type;
	}
	
	public Order(String size, String type, String optional) {
		this.size = size;
		this.type = type;
		this.optional = optional;
	}
		
	public void addOptional(String optional) {
		this.optional = optional;
	}
	
	
	public String getOrder() {
		if(optional != null) {
		return "" + size + " " + type + " w/ " + optional;
		}else {
			return size + " " + type + " ";
		}
		}
	
	
	

	
@Override
	public String toString() {
	if(optional != null) {
	return "" + size + " " + type + " w/ " + optional;
	}else {
		return size + " " + type + " ";
	}
}
	

	//	getters and setters
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOptional() {
		return optional;
	}

	public void setOptional(String optional) {
		this.optional = optional;
	}

	
	
	
	
}
