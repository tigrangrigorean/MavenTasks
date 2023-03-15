package com.tasks.homework5;

public class Car {
	String model;
	String color;
	int currentSpeed;
	boolean isEngineStart;
	
	
	/**
	 * @param model
	 * @param color
	 * @param currentSpeed
	 */
	public Car(String model, String color, int currentSpeed) {
		super();
		this.model = model;
		this.color = color;
		this.currentSpeed = currentSpeed;
		
	}
	
	/**
	 * isEngine false
	 */
	void stopEngine() {
		isEngineStart = false;
	}
	/**
	 * isEngine true
	 */
	void startEngine() {
		isEngineStart = true;
	}


	public static void main(String[] args) {
		
		Car Mercedes1 = new Car("C203", "Black", 0);
		Car Mercedes2 = new Car("S505", "White", 0);

	}

}
