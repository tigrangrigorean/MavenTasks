package com.tasks.homework14.second_exercise;

public class PrintClass {
	
	CoffeeSize[] arr = CoffeeSize.values();

	/**
	 * @Print CofeSize name & ordinal
	 */
	public void print() {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].name() + " " + arr[i].ordinal());
		}
	}
		

}
