package com.tasks.homework14.fifth_exercise;

import java.util.Scanner;

public class SeasonClass {
	
	Season[] season = Season.values();
	
	/**
	 * @Print the season, when user input temperature
	 */
	
	public void print() {
		System.out.println("Enter temperature");
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		
	for(int i = 0; i<season.length; i++) {
		if(temperature >= season[i].minTemperature && temperature <= season[i].maxTemperature) {
			System.out.println(season[i].name());
		}
	}
		
	}

}
