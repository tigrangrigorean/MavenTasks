package com.tasks.homework14.sixth_exercise;

import java.util.Scanner;

public class OrderClass {

	PizzaSize pizzaSize;
	Topping topping = Topping.MUSHROOMS;
	String pizzaName;
	int sumToppings;
	
	/**
	 * this method for inputs and switch
	 */
	void inputs() {
		System.out.println("Please enter the pizza Size");
		Scanner sc = new Scanner(System.in);
		pizzaName = sc.nextLine();
		pizzaName.toUpperCase();
		switch(pizzaName) {
		case "SMALL":
			pizzaSize = pizzaSize.SMALL;
			break;
		case "MEDIUM":
			pizzaSize = pizzaSize.MEDIUM;
			break;
		
		case "LARGE":
			pizzaSize = pizzaSize.LARGE;
			break;
		}
		System.out.println("How many toppings would you like?");
		sumToppings = sc.nextInt();
	}
	
	/**
	 * this method for account
	 */
	
	public void account() {
		inputs();
		
		double summ = pizzaSize.sizeSum * topping.pizzaSum * sumToppings;
		
		System.out.println("Your order: " + (int)summ + "$");
		
	}
	
}
