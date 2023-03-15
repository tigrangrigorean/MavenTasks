package com.tasks.homework13.first_exercise.data;


public enum Planets {
	MERCURY(88),VENUS(225),EARTH(365),MARS(687),JUPITER(4333),SATURN(10759),URANUS(30687),NEPTUNE(60200);
	
	private String firstChar = this.toString().substring(0, 1).toUpperCase();
	private String name = firstChar + this.toString().substring(1).toLowerCase();
	
	private int yearLength;
	
	private Planets(int days) {
		yearLength = days;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the yearLength
	 */
	public int getYearLength() {
		return yearLength;
	}

	/**
	 * @param yearLength the yearLength to set
	 */
	public void setYearLength(int yearLength) {
		this.yearLength = yearLength;
	}
	
}
