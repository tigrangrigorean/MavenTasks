package com.tasks.homework11;

public class Truck extends Car{

	private int capacity;
	
	/**
	 * setEngineType
	 * setPassangerCount
	 */
	
	public Truck() {
		super.setEngineType("Ecotec");
		super.setPassangerCount(3);
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
}
