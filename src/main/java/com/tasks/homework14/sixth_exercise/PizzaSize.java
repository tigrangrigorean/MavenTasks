package com.tasks.homework14.sixth_exercise;

public enum PizzaSize {
	SMALL(1.3),MEDIUM(2.1),LARGE(2.7);
	
	public double sizeSum;
	public String name = this.name().toUpperCase();
	

	/**
	 * @param sizeSum
	 */
	private PizzaSize(double sizeSum) {
		this.sizeSum = sizeSum;
	}
	
	
}
