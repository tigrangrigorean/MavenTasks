package com.tasks.homework6;

import java.util.Random;

public class Exercises {
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return result - true or false
	 */
	
	boolean riceBagsMethod(Integer x, Integer y, Integer z) {
		
		boolean result = false;
		if (x * 5 >= z) {
		    if (y >= z % 5)
		        result = true;
		} else {
		    if (y >= z - x * 5) {
		        result = true;
		    }
		}
		return result;
	}
	
	/**
	 * 
	 * @param number
	 * @return i
	 */
	int primeFactors(int number) {
	
		int i;
		for ( i = 2; i <= number; i++) {
			if (number % i == 0) {
				number /= i; 
				i--;
		}
	} 
		return i; 
}
		
	
	/**
	 * @print Num odd or even
	 */
	void evenOrOddNum() {
		double num = Math.random() * 100;
		int sub = (int) num;
		
		if(sub % 2 == 0) {
			System.out.println(sub + " num is even");
		}
		else {
			System.out.println(sub + " num is odd");
		}
		
	}
	/**
	 * @print smallest & largest number
	 */
	void smallestAndLargestRandom() {
		
		int smallest = 100;
		int largest = 0;
		
		for(int i = 0 ; i<= 10; i++) {
			int num = new Random().nextInt(100);
			if(num > largest) {
				largest = num;
			}
			if(num < smallest) {
				smallest = num;
			}
		}
		System.out.println("the smallest num: " + smallest);
		System.out.println("the largest num: " + largest);
	}

}
