package com.tasks.homework13.second_exercise;

public enum DaysOfWeek {
	
	MONDAY(),TUESDAY(),WEDNESDAY(),THURSDAY(),FRIDAY(),SATURDAY(),SUNDAY();



	/**
	 * @return the numberOfDay
	 */
	public int getNumberOfDay() {
		return this.ordinal()+1;
	}
	
	
	
}
