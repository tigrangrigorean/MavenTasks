package com.tasks.homework12.seventh_exercise;

public class A extends Marks {

	/**
	 * default constructor
	 */
	public A() {
		
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @print a,b,c
	 */
	public A (int a, int b , int c) {
		System.out.println(getPercentage(a,b,c));
	}
	
	/**
	 * @param Array mark
	 * @return summ
	 */
	@Override
	public double getPercentage(int ... mark) {
		double summ = 0.0;
		for(int i = 0; i<mark.length; i++) {
			summ += mark[i];
		}
		summ /= mark.length;
		return summ;
	}

}
