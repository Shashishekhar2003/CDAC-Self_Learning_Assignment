package com.demo;

//Use different methods of java defined wrapper classes. 


public class Q02Wrapper {

	public static void main(String[] args) {

		// valueOf()= primitive to object
		Integer obj1 = Integer.valueOf(100);
		System.out.println("valueof():" + obj1);

		// ParseInt()= String to int
		int num = Integer.parseInt("200");
		System.out.println("parseInt(): " + num);

		// toString() = String to int
		String str = obj1.toString();
		System.out.println("toString(): " + str);

		// compareTo()= compare two values
		Integer a = 50;
		Integer b = 100;
		System.out.println("compareTo(): " + a.compareTo(b));

		// equals() check equality
		Integer x = 100;
		Integer y = 100;
		System.out.println("equal(): " + x.equals(y));

		// doubleValue()
		Double d = 10.5;
		System.out.println("doubleValue(): " + d.doubleValue());

		// charValue()
		Character ch = 'A';
		System.out.println("charValue(): " + ch.charValue());

		// booleanValue()
		Boolean bool = true;
		System.out.println("booleanValue(): " + bool.booleanValue());

	}

}
