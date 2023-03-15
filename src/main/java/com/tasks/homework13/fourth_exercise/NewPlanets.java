package com.tasks.homework13.fourth_exercise;

public enum NewPlanets {
	
	MERCURY(800123445),VENUS(70420000),EARTH(60003551),MARS(1000000000),JUPITER(12341254),SATURN(1234123),URANUS(1232113),NEPTUNE(555542);
	
	private int distance;

	/**
	 * @param distance
	 */
	private NewPlanets(int distance) {
		this.distance = distance;
	}

	/**
	 * @return the distance
	 */
	public String getDistance() {
		return "Distance from sun : " + distance + "m";
	}
	
	
}
