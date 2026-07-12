package com.demo;


import java.util.*;

//Employee class implementing Comparable
class Employee implements Comparable<Employee1> {
 int id;
 String name;
 double salary;

 Employee(int id, String name, double salary) {
     this.id = id;
     this.name = name;
     this.salary = salary;
 }

 // Comparable (sort by salary)
 public int compareTo(Employee1 e) {
     return Double.compare(this.salary, e.salary);
 }

 public String toString() {
     return id + " " + name + " " + salary;
 }
}

//Comparator (sort by name)
class NameComparator1 implements Comparator<Employee1> {
 public int compare(Employee1 e1, Employee1 e2) {
     return e1.name.compareTo(e2.name);
 }
}

//Comparator (sort by id)
class IdComparator1 implements Comparator<Employee1> {
 public int compare(Employee1 e1, Employee1 e2) {
     return e1.id - e2.id;
 }
}

public class Q15EmployeeSort {
 public static void main(String[] args) {
     List<Employee1> list = new ArrayList<>();

     list.add(new Employee1(3, "Shashi", 50000));
     list.add(new Employee1(1, "Yash", 30000));
     list.add(new Employee1(2, "Akshay", 40000));

     // Comparable sorting (by salary)
     Collections.sort(list);
     System.out.println("Sorted by Salary:");
     list.forEach(System.out::println);

     // Comparator sorting (by name)
     Collections.sort(list, new NameComparator1());
     System.out.println("\nSorted by Name:");
     list.forEach(System.out::println);

     // Comparator sorting (by id)
     Collections.sort(list, new IdComparator1());
     System.out.println("\nSorted by ID:");
     list.forEach(System.out::println);
 }
}