package com.tasks.homework14;

import com.tasks.homework14.fifth_exercise.SeasonClass;
import com.tasks.homework14.first_exercise.RunClass;
import com.tasks.homework14.fourth_exercise.DaysClass;
import com.tasks.homework14.second_exercise.PrintClass;
import com.tasks.homework14.sixth_exercise.OrderClass;

public class Main {

	public static void main(String[] args) {
		
		RunClass runClass = new RunClass();
		runClass.changeState();
		
		PrintClass printClass = new PrintClass();
		printClass.print();
		
		DaysClass daysClass = new DaysClass();
		daysClass.print();
		
		SeasonClass seasonClass = new SeasonClass();
		seasonClass.print();
		
		OrderClass orderClass = new OrderClass();
		orderClass.account();
		
		
	}

}
