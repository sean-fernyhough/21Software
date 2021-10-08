package com.qa.methods;

import java.util.ArrayList;

public class methods {

public static ArrayList<ArrayList<String>> orders = new ArrayList<>();
public static ArrayList<ArrayList<String>> doneOrders = new ArrayList<>();

	public static ArrayList<ArrayList<String>> addOrder(String size, String coffee) {
		ArrayList<String> coffeeOrder = new ArrayList<>();
		coffeeOrder.add(size);
		coffeeOrder.add(coffee);
		orders.add(coffeeOrder);
//		System.out.println(orders);
		return orders;
		
	}
	
	public static ArrayList<ArrayList<String>> returnOrders(){
		return orders;
	}
	
	public static ArrayList<String> returnLastOrder(){
		return orders.get(orders.size() - 1);
	}
	
	public static ArrayList<ArrayList<String>> modifyOrder(String optional) {
		ArrayList<String> modifiedOrder = orders.get(orders.size() - 1);
		modifiedOrder.add(optional);
		orders.set(orders.size() - 1, modifiedOrder);
//		System.out.println(orders);
		return orders;
	}
	
	public static ArrayList<String> orderRemove(){
		ArrayList<String> finishedOrder = orders.get(orders.size() - 1);
//		System.out.println(finishedOrder);
//		System.out.println(orders);
		orders.remove(orders.size() - 1);
		return finishedOrder;
	}
	
	public static void orderDone(ArrayList<String> order) {
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
