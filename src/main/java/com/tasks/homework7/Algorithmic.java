package com.tasks.homework7;

import java.util.Random;
import java.util.Scanner;

public class Algorithmic {

	/**
	 * @print number * i
	 */
	void multiplicationTable() {
		
		int number;
		
		do {
			Scanner sc = new Scanner(System.in);
			number = sc.nextInt();
			if(number >= 0) {
				for(int i = 0; i<=10; i++) {
					System.out.println(number + " x " + i + " = " + (number * i) );
				}
			}
		}while(number<0);
	}
	
	/**
	 * @print num
	 */
	void powOrNot() {
		
      Scanner sc = new Scanner(System.in);
      int firstNum = sc.nextInt();
      int secondNum = sc.nextInt();
      int rise = firstNum;
      if (secondNum > 0) {
          for (int i = 1; i < secondNum; i++) {
              rise *= firstNum;
          }
          System.out.println(rise);
      } else {
          for (int i = 1; i < -secondNum; i++) {
        	  rise *= firstNum;
          }
          double num =  1.0 / (double) rise;
          System.out.println(num);
      }
		
	}
	
	/**
	 * @param num
	 * @print rNum
	 */
	
	void reverseNumber(int num) {
		
		int rNum = 0;
		while( num != 0 )
	      {
			rNum = rNum * 10;
			rNum = rNum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of input number is: "+rNum);
	        
		
	}
	
	/**
	 * @print num is prime or not
	 */
	
	void isPrime() {
		System.out.println("Enter the positive number");
		Scanner sc = new Scanner(System.in);
		
		 int num = sc.nextInt();
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
	}
	
	/**
	 *  @print sum
	 */
	
	void sumOfEnteredNums() {
		
		char a = 0;
		int xy = 0;
		int sum = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			int y=  sc.nextInt();
			
			xy = x + y;
			sum += xy;
			System.out.println(sum);
			
			System.out.println("Do you want to add again? Yes - Y , No - Nothing ");
			a = sc.next().charAt(0);
			
			
		}while(a == 'y');
	}
	/**
	 * Num is positive, negative or zero
	 * @print quantity
	 */
	void quantityNum() {
		Scanner sc = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		char a;
		
		
		do {
			int num = sc.nextInt();
			
			if(num >0 ) {
				positive++;
			}
			else if(num == 0) {
				zeros++;
			}
			else {
				negative++;
			}
			
			System.out.println("If you want to repeat press y");
			a = sc.next().charAt(0);
			
		}while(a == 'y');
		
		System.out.println("Positive : " + positive);
		System.out.println("Negative : " + negative);
		System.out.println("Zeros : " + zeros);
		
	}
	
	/**
	 * @print largest & smallest values
	 */
	
	void largestOrSmallestValue() {
	Scanner sc = new Scanner(System.in);
		
		
		char a;
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int temp;
		
		
		do {
			
			temp = sc.nextInt();
			
			if(temp > largest) {
				largest = temp;
			}
			if(temp < smallest) {
				smallest = temp;
			}
			
			
			
			System.out.println("If you want to repeat press y");
			a = sc.next().charAt(0);
			
			
		}while(a == 'y');
		System.out.println("Largest number = : " + largest);
		System.out.println("Largest number = : " + smallest);
	}
	
	/**
	 * @print i
	 */
	
	void armstrongNumbers() {
		
		 int n, count = 0, a, b, c, sum = 0;
		 
	        for(int i = 1; i <= 500; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
	        }
	}
	
	/**
	 * @print sum
	 */
	void calculateSeries() {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=n; i++) {
			sum += 1/i;
		}
		System.out.println(sum);
		
	}
	
	/**
	 * @print number is small or large
	 */
	void numIsSmallOrLarge() {
		Random rand = new Random();
		int randsub = rand.nextInt(1,10);
		boolean flag = false;
		while(!flag) {
			System.out.println("Enter your number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			if(num == randsub) {
				System.out.println("Your number is true : " + num);
				flag = true;
			}
			else if(num < randsub) {
				System.out.println("Your number is small.");
			}
			else {
				System.out.println("Your number is large");
			}
			
		}
	}
	
	/**
	 * print square
	 * @print *
	 */
	void printSquare() {
		for(int i = 0; i<=5; i++) {
			for(int j = 0; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	/**
	 * @print *
	 */
	
	void print() {
		
		for (int i = 1; i <= 5; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
	}
	
	/**
	 * @print num triangle
	 */
	
	void numsTriangle() {
		   
		    
	        for(int i=0; i<5; i++) 
	        { 
	           int num=1; 
	            for(int j=0; j<=i; j++)
	            { 
	                System.out.print(num+ " "); 

	                num++; 
	            } 
	            System.out.println(); 
	        } 
	}
	
	/**
	 * @print symbol
	 */
	void printNums() {
	    
		int firstNum = 5;
        int sum = 2;
        
        for (int i = 0; i < 5; i++) {
        	
            for (int j = 0; j < firstNum; j++) {
            	
                if (j <= firstNum - sum) {
                    System.out.print("  ");
                    
                } else {
                	
                    int symbol = i + 1;
                    if (symbol > 9) {
                        symbol %= 10;
                    }
                    
                    System.out.print(symbol + " ");
                }
            }
            firstNum++;
            sum += 2;
            System.out.println();
        }

	}
	
	/**
	 * 
	 * @param x
	 * @print sine
	 */
	void calculateSin(int x) {
		
		 double y;
	        y = x*Math.PI/180;
	        int n = 10;
	        int i,j,fac;
	        double sine = 0;
	        for(i=0; i<=n; i++){
	            fac = 1;
	            for(j=2; j<=2*i+1; j++){
	                fac*=j;
	            }
	            sine+=Math.pow(-1.0,i)*Math.pow(y,2*i+1)/fac;
	        }
	        System.out.format("The sine of " + x + " is %f",sine);
	}
	
	/**
	 * 
	 * @param x
	 * @param n
	 * @print result
	 */
	
	void calculateCos(double x, int n) {
	    x = x * (Math.PI / 180.0);
	    double result = 1;
	    double s = 1, fact = 1, pow = 1;
	    for (int i = 1; i < 5; i++) {
	        s = s * -1;
	        fact = fact * (2 * i - 1) * (2 * i);
	        pow = pow * x * x;
	        result = result + s * pow / fact;
	    }
	    System.out.println(result);
	}

}
