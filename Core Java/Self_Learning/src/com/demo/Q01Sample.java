package com.demo;

//Create sample classes to understand boxing & unboxing. 

class Q01Sample {
	public static void main(String[] args) {

		// Primitive values
		int i = 100;
		double d = 20.5;
		char c = 'A';
		boolean b = true;

//BOXING (Primitive - Object)
		Integer objInt = i;
		Double objDouble = d;
		Character objChar = c;
		Boolean objBoolean = b;

		System.out.println("---- BOXING ----");
		System.out.println("Integer Object: " + objInt);
		System.out.println("Double Object: " + objDouble);
		System.out.println("Character Object: " + objChar);
		System.out.println("Boolean Object: " + objBoolean);

		// UNBOXING (Object - Primitive)
		int newInt = objInt;
		double newDouble = objDouble;
		char newChar = objChar;
		boolean newBoolean = objBoolean;

		System.out.println("\n---- UNBOXING ----");
		System.out.println("int value: " + newInt);
		System.out.println("double value: " + newDouble);
		System.out.println("char value: " + newChar);
		System.out.println("boolean value: " + newBoolean);
	}
}