package com.tasks.homework12.seventh_exercise;

public class B extends Marks{

	/**
	 * default constructor
	 */
	public B() {
		
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @print a,b,c,d
	 */
	public B(int a, int b, int c, int d) {
		System.out.println(getPercentage(a,b,c,d));
	}
	
	/**
	 * @param Array of marks
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
