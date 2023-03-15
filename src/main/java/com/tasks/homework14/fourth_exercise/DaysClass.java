package com.tasks.homework14.fourth_exercise;

import java.util.Scanner;

import com.tasks.homework13.second_exercise.DaysOfWeek;

public class DaysClass {
	
	DaysOfWeek daysOfWeek;
	
	/**
	 * @Print the day is Weekend or not
	 */
	public void print() {
		Scanner sc = new Scanner(System.in);
		String nameDay = sc.next();
		nameDay = nameDay.toUpperCase();
		
		if(nameDay.equals(DaysOfWeek.SATURDAY.name()) || nameDay.equals(DaysOfWeek.SUNDAY.name())) {
			System.out.println("Weekend");
		}
		else {
			System.out.println("Isn't weekend, please work!");
		}
		
	}

}
