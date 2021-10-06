package com.qa.demo;

import java.security.DomainCombiner;

public class dataType {
//java is an explicit language, variables must be assigned a data type
	int number = 5;
//	java has two groups of data - primitive and complex
//	primitive is smallest form of data java can understand.
//	examples are boolean, char, short, int, float, double, byte
//	complex data types are references to primitive data types, objects such as strings which are arrays of chars
// complex variables start with uppercase where as primitive start with lowercase

	
//	java return types 
//	all methods should return something, meaning they will be equal to a value
//return types must be explicitly stated within the method declaration, void means nothing will be returned
	public static String hello() {
		System.out.println("Hello");
		return "hello";
	}
public static void main(String[] args) {
	System.out.println(hello());
}
}
