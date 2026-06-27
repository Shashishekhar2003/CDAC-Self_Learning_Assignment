package com.demo;

abstract class Person{
	String name;
	int age;
	
	
	public Person() {
		super();
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	abstract void displayDetails();
	
	
}

public class Q06Student extends Person{
	int id;
	double marks;
	
	public Q06Student() {
		super();
	}

	public Q06Student(String name, int age,int id, double marks) {
		super(name,age);
		this.id = id;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"Q6Student [id=" + id + ", marks=" + marks + "]";
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Student Name: "+ name);
		System.out.println("Student Age: "+age);
		System.out.println("Student Id"+ id);
		System.out.println("Student Marks"+ marks);
	}
	
	
	public static void main(String[] args) {
		Q06Student s1 = new Q06Student();
		
		s1.setAge(23);
		s1.setName("Yash");
		
		s1.displayDetails();
		System.out.println("Student Information");
		
	}
}









