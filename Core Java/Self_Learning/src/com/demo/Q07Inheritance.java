package com.demo;

    class Employee1{
	void work() {
		System.out.println("Employee is working");
	}
   }


    class Developer extends Employee1 {
	void code() {
		System.out.println("Developer is coding");
	}
   }


    class SeniorDeveloper extends Developer {
	void reviewCode() {
		System.out.println("Senior Developer reviews code");
	}
  }


    class Manager extends Employee1 {
	void manage() {
		System.out.println("Manager is managing team");
	}
   }

   class HR extends Employee1 {
	void handleRecruitment() {
		System.out.println("HR is handling recruitment");
	}
    }

// Main Class
public class Q07Inheritance {
	public static void main(String[] args) {

		System.out.println("Single Inheritance ");
		Developer d = new Developer();
		d.work();
		d.code();

		System.out.println("\nMultilevel Inherita");
		SeniorDeveloper sd = new SeniorDeveloper();
		sd.work();
		sd.code();
		sd.reviewCode();

		System.out.println("\nHierarchical Inheritance ");
		Manager m = new Manager();
		m.work();
		m.manage();

		HR hr = new HR();
		hr.work();
		hr.handleRecruitment();
	}
}