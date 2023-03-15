package com.tasks.homework12.eighth_exercise;

public abstract class AbstractClass {
	
	/**
	 * @print
	 */
	public AbstractClass () {
		System.out.println("This is constructor of Abstract Class");
	}
	
	public abstract void a_Method();
	
	/**
	 * @print
	 */
	public void non_Abstract() {
		System.out.println("This is a normal method");
	}
}
