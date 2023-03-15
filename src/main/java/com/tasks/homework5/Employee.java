package com.tasks.homework5;

public class Employee {
	
	int id;
	String name;
	String department;
	int age;
	String gender;
	
	/**
	 * @param id
	 * @param name
	 * @param department
	 * @param age
	 * @param gender
	 */
	public Employee(int id, String name, String department, int age, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.gender = gender;
	}

	/**
	 * @print id, name , age , gender
	 */
	void printEmployee() {
		System.out.println(id + " " + name + " " + age + " " + gender);
	}

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(0,"Mark","SWAT", 25, "Male");
		Employee employee2 = new Employee(1,"Emily","SWAT", 22, "Female");
		Employee employee3 = new Employee(2,"Clark","Police Academy", 35, "Male");
		
		employee1.printEmployee();
		employee2.printEmployee();
		employee3.printEmployee();

	}

	

}
