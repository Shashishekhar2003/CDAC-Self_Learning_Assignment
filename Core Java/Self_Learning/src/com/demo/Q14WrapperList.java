package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Q14WrapperList {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		List<Double> doubleList = new ArrayList<>();
		List<Character> charList = new ArrayList<>();

		intList.add(45);
		intList.add(95);
		intList.add(15);

		doubleList.add(3.11);
		doubleList.add(2.11);
		doubleList.add(1.44);

		charList.add('A');
		charList.add('Z');
		charList.add('Y');

		System.out.println("Initial Integer List: " + intList);
		System.out.println("Initial Double List: " + doubleList);
		System.out.println("Initial Character List: " + charList);

		intList.remove(Integer.valueOf(5));
		doubleList.remove(1);
		charList.remove(Character.valueOf('C'));

		System.out.println("\nAfter Deletion:");
		System.out.println("Integer List: " + intList);
		System.out.println("Double List: " + doubleList);
		System.out.println("Character List: " + charList);

		boolean foundInt = intList.contains(45);
		boolean foundDouble = doubleList.contains(2);
		boolean foundChar = charList.contains('B');

		System.out.println("\nSearch Results:");
		System.out.println("20 in Integer List? " + foundInt);
		System.out.println("2.71 in Double List? " + foundDouble);
		System.out.println("B in Character List? " + foundChar);

		System.out.println("\nIterating over Integer List:");
		for (Integer i : intList) {
			System.out.println(i);
		}

		System.out.println("\nIterating over Double List:");
		doubleList.forEach(System.out::println);

		System.out.println("\nIterating over Character List:");
		Iterator<Character> itr = charList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Collections.sort(intList);
		Collections.sort(doubleList);
		Collections.sort(charList);

		System.out.println("\nAfter Sorting:");
		System.out.println("Integer List: " + intList);
		System.out.println("Double List: " + doubleList);
		System.out.println("Character List: " + charList);
	}
}