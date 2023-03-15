package com.tasks.homework2;

public class Methods {
	
	// 1
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 0
	 */
	static int firstMethod(int a, int b) {
		return 0;	
	}
	
	// 2 
	/**
	 * @return;
	 */
	static void secondMethod() {
		
	}
	
	// 3
	/**
	 * 
	 * @param a
	 * @param b
	 * @print Hello World
	 */
	static void thirdMethod(boolean a, boolean b) {
		System.out.println("Hello World");
	}
	
	// 4
	/**
	 * 
	 * @param a
	 * @return a
	 */
	static char fourthMethod(char a) {
		return a;
	}
	
	// 5
	/**
	 * 
	 * @param a
	 * @param b
	 * @return b
	 */
	static float fifthMethod(float a, float b) {
		return b;
	}
	
	//6
	/**
	 * 
	 * @param n
	 * recursion
	 */
	static void recursionMethod(int n) {
		
		if(n!= 0) {
			System.out.println(n);
			recursionMethod(n-1);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(firstMethod(2, 5));
		secondMethod();
		thirdMethod(true,false);
		System.out.println(fourthMethod('a'));
		System.out.println(fifthMethod(11.5f , 2.7f));
		recursionMethod(5);
		
	}

}
