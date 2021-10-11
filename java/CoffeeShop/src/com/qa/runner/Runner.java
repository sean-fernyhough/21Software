package com.qa.runner;

import com.qa.order.Order;
import com.qa.order.Orders;

public class Runner {
	
	public static void main(String[] args) {
		
	
	Orders orderList = new Orders();
	Orders doneOrders = new Orders();
	
	Order E1 = new Order("small", "Iced Tea");
	System.out.println(E1);
	E1.addOptional("Cream");
	System.out.println(E1);
	Order E2 = new Order("Small", "Black Coffee", "cream");

	
	System.out.println(E2.getOrder());
	
	orderList.addTo(E1);
	orderList.addTo(E2);
	
	doneOrders.addTo(E1);

	
	System.out.println(orderList);

	System.out.println(doneOrders);
	}
}
