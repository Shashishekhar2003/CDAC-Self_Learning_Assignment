package com.demo;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


class Employees {
	int id;
	String name;
	double salary;

	Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + salary;
	}
}

public class Q17EmpHashSet {
	public static void main(String[] args) {
		Set<Employees> employees = new HashSet<>();

		employees.add(new Employees(1, "Shashi", 10000));
		employees.add(new Employees(2, "Omkar", 4500));
		employees.add(new Employees(3, "Sandesh", 2500));

		employees.add(new Employees(1, "Vivek", 3000));

		System.out.println("Employee in HashSet ");
		for (Employees e : employees) {
			System.out.println(e);
		}
	}
}