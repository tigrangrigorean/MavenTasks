package com.tasks.homework2;

public class Methods {
	
	// 1
	/**
	 * 
	 * @param a
	 * @param b
	 * @return 0
	 */
	static int methodReturnZero(int a, int b) {
		return 0;	
	}
	
	// 2 
	/**
	 * @return;
	 */
	static void methodWithoutBody() {
		
	}
	
	// 3
	/**
	 * 
	 * @param a
	 * @param b
	 * @print Hello World
	 */
	static void methodPrintHW(boolean a, boolean b) {
		System.out.println("Hello World");
	}
	
	// 4
	/**
	 * 
	 * @param a
	 * @return a
	 */
	static char methodReturnChar(char a) {
		return a;
	}
	
	// 5
	/**
	 * 
	 * @param a
	 * @param b
	 * @return b
	 */
	static float methodReturnFlB(float a, float b) {
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

}
