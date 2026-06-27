package com.demo;

//Create a class Employee and encapsulate the data members

class Q05Employee {

	private int empId;
	private String name;
	private double salary;


	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Invalid Salary!");
		}
	}


	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}



	public static void main(String[] args) {

		Q05Employee emp = new Q05Employee();

	
		emp.setEmpId(10);
		emp.setName("Sandesh");
		emp.setSalary(45000);

		
		System.out.println("Employee Details:");
		System.out.println("ID: " + emp.getEmpId());
		System.out.println("Name: " + emp.getName());
		System.out.println("Salary: " + emp.getSalary());
	}
}
