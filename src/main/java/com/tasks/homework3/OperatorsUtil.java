package com.tasks.homework3;

public class OperatorsUtil {

	public static void main(String[] args) {
		
		// Arithmetic Operators
		
		int a = 8;
		int b = 6;
		
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a-b);
		System.out.println(a%b);
		
		double c = 6.4;
		double d = 0.03;
		
		System.out.println(c+d);
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c-d);
		System.out.println(c%d);
		
		int x = 2 * ((5 + 3) * 4 - 8);
		int y = 2 * 5 + 3 * 4 - 8;
		
		System.out.println(x);
		System.out.println(y);
		
		// Unary Operators
		
		int e = 10;
		int f = -88;
		boolean n1 = true;
		
		System.out.println(-e);
		System.out.println(-f);
		System.out.println(+e);
		System.out.println(-e + 92);
		System.out.println(!n1);
		System.out.println(!(!n1));
		System.out.println(e++);
		System.out.println(--f);
		
		  x = 3;
		   y = ++x * 5 / x-- + --x;
		   System.out.println("x is " + x);
		   System.out.println("y is " + y);

		   // Assignment Operator
		   
		   x = (int)1.0;
		   y = (short)1921222;
		   System.out.print(2147483647+1);
		   y = (x=3);
		   
		   boolean yy = false;
		   boolean xx = (yy = true);
		   System.out.println(xx);
		   
		   int aa = 10;
		   int bb = 20;
		   
		   // Relational Operators
		   
		   
		   System.out.println(x < y);
		   System.out.println(x <= y);
		   System.out.println(x > y);
		   System.out.println(x >= y);
		   
		   //  Additional  tasks
		   
		   // Find and correct mistakes
		   
		   // 1
		   float yyy = 2.1f; 
		   
		   // 2
		   byte xxxx = 5;
	       byte yyyy = 10;
	       byte zzzz = (byte) (xxxx + yyyy);
	       
	       // 3
	       
	       short xsh = 10;
	       short ysh = 3;
	       short zsh = (short) (xsh * ysh);
	       
	       // 4 
	       
	       long xlg = 10;
	       int ylg = 5;
	       ylg = (int) (ylg * xlg);
	       
	       //__________________
	       
	       
	       int reverse1 = 10;
	       int reverse2 = 5;
	       int temprev;
	       
//	       temprev = reverse1;
//	       reverse1 = reverse2;
//	       reverse2 = reverse1;
//	       
	       
	       reverse1 = reverse1 + reverse2;
	       reverse2 = reverse1 - reverse2;
	       reverse1 = reverse1 - reverse2;
	       
	       int num = 100;
	       System.out.println(num * (num+1) / 2);
	       
	       int a1 = 8;
	       int b1 = 3;
	       
	       // Bitwise & Logical Operators
	       
	     System.out.println(a1 & b1);
	     System.out.println(a1 ^ b1);
	     System.out.println(a1 | b1);
	     System.out.println(~a1);
	     System.out.println(true || (a1<4));
	     System.out.println((b1 >= 6) || (++a <= 7));
	     System.out.println((a1<b1)?a1:b1);
	     System.out.println(b^b);
	     
	     // Shift Operator
	     
	     System.out.println(10 << 2);
	     System.out.println(-10 << 3);
	     System.out.println(20 >> 2);
	     System.out.println(15 >> 3);
	     
	     int number = 30;
	     
	     System.out.println(number << 3);
	     System.out.println(number << 4);
	     
	     
	}

}
