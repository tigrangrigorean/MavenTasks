package com.tasks.homework14.third_exercise;

public class PlanetClass {
	Planet[] arr = Planet.values();
	
	/**
	 * @Print Planet name, mass & distance
	 */
	void print() {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].name + " " + arr[i].mass + " " + arr[i].distance);
		}
	}
}
