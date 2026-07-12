package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11EmployeeCollection {
	public static void main(String[] args) {
		List<EmpComparable> list = new ArrayList<>();
		list.add(new EmpComparable(1, "KG", 45000));
		list.add(new EmpComparable(3, "GK", 10000));
		list.add(new EmpComparable(2, "ABC", 50000));

		System.out.println("Original List:");
		for (EmpComparable e : list)
			System.out.println(e);

		Collections.sort(list);
		System.out.println("\nSorted by ID (Comparable):");
		for (EmpComparable e : list)
			System.out.println(e);

		Collections.sort(list, new EmpComparator());
		System.out.println("\nSorted by Salary (Comparator):");
		for (EmpComparable e : list)
			System.out.println(e);
	}
}