package com.tasks.homework11;

public class Child extends Parent{

	/**
	 * Constructor calls method
	 */
	public Child() {
		super.showMessage();
		this.showMessage();
	}
	
	/**
	 * @print "Hello Child Class"
	 */
	@Override
	void showMessage() {
		System.out.println("Hello Child Class");
	}
	
}
