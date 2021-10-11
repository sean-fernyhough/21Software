package com.qa.order;

import java.util.ArrayList;

public class Orders {

	public ArrayList<Order> orderList= new ArrayList<Order>();
	
	public Orders() {
	}
	
	public void addTo(Order order) {
		this.orderList.add(order);
		System.out.println();
	}

	@Override
	public String toString() {
		return "" + orderList + "";
	}
	
	
	
}
