package com.qa.methods;

import java.util.ArrayList;

public class methods {

public static ArrayList<String> orders = new ArrayList<>();
public static ArrayList<String> doneOrders = new ArrayList<>();

	public static ArrayList<String> addOrder(String coffeeOrder) {
		orders.add(coffeeOrder);
//		System.out.println(orders);
		return orders;
		
	}
	
	public static String returnLastOrder(){
		return orders.get(orders.size() - 1);
	}
	
	public static ArrayList<String> modifyOrder(String optional) {
		String modifiedOrder = orders.get(orders.size() - 1);
		modifiedOrder = modifiedOrder + " " + optional;
		orders.set(orders.size() - 1, modifiedOrder);
//		System.out.println(orders);
		return orders;
	}
	
	public static String orderRemove(){
		String finishedOrder = orders.get(orders.size() - 1);
//		System.out.println(finishedOrder);
//		System.out.println(orders);
		orders.remove(orders.size() - 1);
		return finishedOrder;
	}
	
	public static void orderDone(String order) {
		doneOrders.add(order);
//		System.out.println(doneOrders);
	}
	
	public static void amount() {
		System.out.println(orders.size());
		System.out.println(doneOrders.size());
	}
	
	public static void clearOrders() {
//		System.out.println(orders);
//		System.out.println(doneOrders);
		orders.clear();
//		doneOrders.clear();
//		System.out.println(orders);
		System.out.println(doneOrders);
	}
	
}
