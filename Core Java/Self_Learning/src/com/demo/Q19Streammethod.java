package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q19Streammethod {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,5,4,9,4,7);

	     	List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
	     	System.out.println("Squares (map): " + squares);

		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum (reduce): " + sum);

		long countEven = numbers.stream().filter(n -> n % 2 == 0).count();
		System.out.println("Count of even numbers: " + countEven);

		   List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
		   System.out.println("Sorted list: " + sortedList);

		   List<Integer> greaterThanFour = numbers.stream().filter(n -> n > 4).collect(Collectors.toList());
		   System.out.println("Numbers > 4: " + greaterThanFour);

		System.out.println("Iterating with forEach:");
		numbers.stream().forEach(System.out::println);

		   List<Integer> withDuplicates = Arrays.asList(1, 2, 1, 7, 7, 5);
		   List<Integer> distinctList = withDuplicates.stream().distinct().collect(Collectors.toList());
		   System.out.println("Distinct elements: " + distinctList);
	}
}