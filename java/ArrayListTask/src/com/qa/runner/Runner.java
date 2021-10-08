package com.qa.runner;

import com.qa.methods.methods;

public class Runner {
public static void main(String[] args) {
//	methods.addOrder("Small", "Espresso");
//	System.out.println(methods.returnOrders());
//	methods.modifyOrder("chocolate");
//	System.out.println(methods.returnOrders());
//	methods.orderDone(methods.orderRemove());
//	methods.amount();
////	methods.clearOrders();
//	
//	methods.addOrder("Large", "Cold Brew");
//	System.out.println(methods.returnOrders());
//	methods.modifyOrder("double shot");
//	System.out.println(methods.returnOrders());
//	methods.orderDone(methods.orderRemove());
//	methods.amount();
//	methods.clearOrders();
	
	methods.addOrder("Small", "Espresso");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("w/ chocolate");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Large", "Cold Brew");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("w/ double shot");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Medium", "Cappucino");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("w/ oat milk");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Medium", "Flat White");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Large", "Choc Cookie Frappe");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("w/ sugar free syrup");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Small", "Caramel Iced Latte");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("w/ honeycomb dust");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Small", "Americano");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Large", "Cafe Au Lait");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("w/ extra milk");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
	
	methods.addOrder("Medium", "Strawberry Iced Tea");
	System.out.println(methods.returnLastOrder());
	methods.modifyOrder("");
	methods.orderDone(methods.orderRemove());
	methods.amount();
	methods.clearOrders();
}
}
