package com.tasks.homework12;

import com.tasks.homework12.eighth_exercise.SubClass;
import com.tasks.homework12.fifth_exercise.Human;
import com.tasks.homework12.fifth_exercise.Man;
import com.tasks.homework12.fourth_exercise.Arithmetic;
import com.tasks.homework12.nineth_exercise.Animals;
import com.tasks.homework12.nineth_exercise.Cat;
import com.tasks.homework12.nineth_exercise.Dog;
import com.tasks.homework12.seventh_exercise.A;
import com.tasks.homework12.seventh_exercise.B;
import com.tasks.homework12.first_exercise.ChildOne;
import com.tasks.homework12.first_exercise.ChildSecond;
import com.tasks.homework12.first_exercise.Parent;

public class Main {

	public static void main(String[] args) {
		
		Parent childOne = new ChildOne();
		Parent childSecond = new ChildSecond();
		Arithmetic arithmetic = new Arithmetic();
		
		childOne.message();
		childSecond.message();
		System.out.println(arithmetic.square(2, 3));

		Human man = new Man();
		man.breathe();
		
		A a = new A(35,37,100);
		B b = new B(35,37,12,99);
		
		SubClass subClass = new SubClass();
		subClass.a_Method();
		subClass.non_Abstract();
		
		Animals dogs = new Dog();
		Animals cats = new Cat();
		
		dogs.dogs();
		cats.cats();
	}

}
