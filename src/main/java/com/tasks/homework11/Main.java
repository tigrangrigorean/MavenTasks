package com.tasks.homework11;

public class Main {

	public static void main(String[] args) {
		//1
		Parent child = new Child();
		//2
		SuperClass subClass = new SubClass();
		//3
		Man teacher = new Teacher();
		//4
		Truck truck = new Truck();
		
		//7
		Address address = new Address("Yerevan","Hr.Qochar", 4);
	
		User user1 = new User("Tom", address);
		User user2 = new User("Mike", address);
		
	}

}
