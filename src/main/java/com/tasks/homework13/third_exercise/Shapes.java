package com.tasks.homework13.third_exercise;

public enum Shapes {
	TRIANGLE,SQUARE;
	
	int a;
	int b;
	int c;
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	
	public void sum(int a, int b, int c) {
		switch(this) {
		case TRIANGLE:
			System.out.println((c*a)/2);
			break;
		case SQUARE:
			System.out.println(a*b);
			break;
		}
	}

	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}

}
