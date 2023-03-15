package com.tasks.homework4;

import java.util.Scanner;

public class StatementsUtil {
	
	
	/**
	 * 
	 * @param x
	 * @print X
	 */
	void coupleOrOdd(int x) {
		if(x % 2 == 0 && x != 0) {
			System.out.println("X is couple");
		}
		else if(x == 0) {
			System.out.println("X is 0");
		}
		else {
			System.out.println("X is odd");
		}
	}
	
	
	/**
	 * 
	 * @param x
	 * @print X
	 */
	void numIsPositiveNegative(int x) {
		if(x <0) {
			System.out.println("x < 0");
		}
		else if(x == 0) {
			System.out.println("x = 0");
		}
		else {
			System.out.println("x > 0");
		}
	}
	
	
	/**
	 * 
	 * @param x
	 * @print true or false
	 */
	void compareNum(int x) {
		if((x < 8 & x > 5) | (x < 20 & x>15)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	
	/**
	 * 
	 * @param x
	 * @print true or false
	 */
	void isMultiple(int x) {
		if(x%5 == 0 && x%7 == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	/**
	 * 
	 * @param x
	 * @print true or false
	 */
	void IsDigitNum(int x) {
		if(x >= 100 && x <=999) {
			int b = (x / 10)%10;
			if(b == 7) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		else {
			System.out.println("Enter number > 100 and < 999");
		}
	}
	// 6
	/**
	 * 
	 * @param x
	 * @param y
	 * @print true or false
	 */
	void isPointBelong(int x, int y) {
		
		if(x < 5 & y < 5) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @print print x or y or z value
	 */
	void maxValue(int x , int y , int z) {
		
		if(x > y && x > z) {
			System.out.println(x);
		}
		else if(y > x && y > z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}
	}
	
	
	/**
	 * Is year leap or not
	 * @param year
	 * @print true or false
	 */
	void isYearLeap(int year) {
		if((year % 4 == 0 && year%100 != 0 )|| year%400 == 0) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	// Fix exercise
	
// 10)	 int x = 0;
//     while (x++ < 10) {
//       if(x == 8) {
//     	  break;
//       }
//    }
//    System.out.println(x);
	
	
// 11) int x = 2;
//    int y = 5;
//    while(x < 10) {
//    y++;
//	  x++;
//    }
	
	
// 12) int x = 15;
//    while (x > 10) {
//       x--;
//    } 
//    System.out.println(x);
//	
	
	

	/**
	 * @print i
	 */
	void printNums() {
		
		for(int i = 1; i<=200; i++) {
			System.out.println(i);
		}
		
	}

	/**
	 * 
	 * @param num
	 * @print b
	 */
	
	void firstDigit(int num) {
		
		String a = Integer.toString(num);
		char b = a.charAt(0);
		System.out.println(b);
	}
	
	
	/**
	 * @print x + y
	 */
	void printXY() {
		int x = 1;
		int y = 0;
		
		while(x != 5 & y != 10) {
			
			x++;
			y++;
			System.out.println(x + y);
		
		}
		
	}
	
	
	/**
	 * print square
	 * @print *
	 */
	void printSquare() {
		
		for(int i = 1; i<5; i++) {
			for(int j = 1; j<7; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}
	
	
	/**
	 * @print sum
	 */
	void sumMultiples() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sc.close();
		for(int i = 1; i<=n; i++) {
			if(i%5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	/**
	 * 
	 * @param n
	 * @print sum
	 */
	void sumOfValues(long n) {
		
		long sum = 1l;
		
		for(int i = 0; i<=n; i++) {
			if(i >= 10 && i <=99) {
				if(i%2 == 0) {
					sum*=i;
				}
			}
		}
		System.out.println(sum);
	}
	
	
	/**
	 * 
	 * @param n
	 * @print b
	 */
	void method(int n) {
		
		double b = (1 + n) / 2;
		
		System.out.println(b);
		
	}
	
	// 18
	/**
	 * 
	 * @param n
	 * @print a + b + c + d + e
	 */
	void digitsFiveNumberSum(int n) {
		
		if(n>=10000 && n <=99999) {
			
			int a = n / 10000;
			int b = n / 1000 % 10;
			int c = n / 100 % 10;
			int d = n / 10 % 10;
			int e = n % 10;
			
			System.out.println(a + b + c + d + e);
			
			
		}
		
	}

}
