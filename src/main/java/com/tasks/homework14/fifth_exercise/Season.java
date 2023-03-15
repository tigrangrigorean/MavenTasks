package com.tasks.homework14.fifth_exercise;

public enum Season {
	
	SPRING(10,19),SUMMER(30,45),AUTUMN(20,29),WINTER(-100,9);

	public int minTemperature;
	public int maxTemperature;
	
	/**
	 * @param minTemperature
	 * @param maxTemperature
	 */
	private Season(int minTemperature, int maxTemperature) {
		this.minTemperature = minTemperature;
		this.maxTemperature = maxTemperature;
	}
	
	
	
}
