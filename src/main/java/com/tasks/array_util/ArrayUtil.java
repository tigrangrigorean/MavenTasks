package com.tasks.array_util;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {
	
	/**
	 * @print positive members of array
	 */
	
	void positiveMebersOfArray() {
		int[] arr = new int[] {1,4,2,-3};
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	/**
	 * @print arr[i] in reverse order
	 */
	void reverseOrderPrint() {
		short[] arr = new short[] {1,2,3};
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	/**
	 * @print the largest member of Array
	 */
	public long largestMember(long[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	/**
	 * @print arrays min value
	 * @print arr[0]
	 */
	public float minValuePrint(float [] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
	
	/**
	 * array m gets reference n
	 * @print array m
	 */
	void referenceArrays() {
		int[] n = new int[] {1,3,5,7,9};
		int[] m = n;
		
		System.out.println(Arrays.toString(m));
	}
	
	/**
	 * print sum of two arrays
	 * @print thirdArr
	 */
	public int[] sumOfTwoArrays() {
		int[] firstArr = new int[] {1,2,3,4 };
		int[] secondArr = new int[] {4,3,2,1};
		int[] thirdArr = new int[4];
		
		for(int i = 0; i<thirdArr.length;i++) {
			thirdArr[i] = firstArr[i] + secondArr[i];
		}
		return thirdArr;
	}
	
	/**
	 * @Print how much K meets in array
	 * @print count
	 */
	void meetsInArray() {
		int count = 0;
		
		int[] arr = new int[] {5,4,2,5,5,7,3};
		
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == 5) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	/**
	 * @print all non-repeating triplets in Array
	 * @print a, b, c
	 */
	
	void nonRepeatingTriplets() {
		
		int a,b,c;
		
		int[] arr = new int[] {1,5,6,4};
		
		for(int i = 0; i<arr.length;i++) {
			
			if(i < arr.length) {
				a = arr[i];
			}
			else {
				break;
			}
			if(i+1 <arr.length) {
				b = arr[i+1];
			}
			else {
				b = arr[0];
			}
			if(i+2 < arr.length) {
				c = arr[i+2];
			}
			else if (i == 3){
				
				c = arr[i-2];
			}
			else {
				c = arr[i-2];
			}
			
			
			System.out.println(a + " " + b + " " + c);
		}
	}
	
	/**
	 * @print reverse Array values
	 * @print arr
	 */
	void reverseArrayValues() {
		Integer[] arr = new Integer[] {6,4,1,5,9,7,1};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * This method sort array, in the end odd numbers
	 * @print arr
	 */
	void sortArrayOdd() {
		int[] arr = new int[] {6,4,1,5,9,7,2};
		
		 for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = arr.length - 1; j > i; j--) {
	                if (arr[j - 1] > arr[j] && arr[i] % 2 != 0) {
	                    int tmp = arr[j - 1];
	                    arr[j - 1] = arr[j];
	                    arr[j] = tmp;
	                }
	            }
	        }
		 System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * @print This Method remove's zeros
	 * @print newArr
	 */
	void removeZeros() {
		Integer[] arr = new Integer[] {1,0,6,4,9,0,0};
		
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] != 0)
		        n++;
		}

		int[] newArr = new int[n];
		int j=0;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] != 0)
		       { 
		         newArr[j]=arr[i]; 
		         j++;
		       }
		}
		System.out.println(Arrays.toString(newArr));
		
	}
	
	
	/**
	 * This method print all the years above the main diagonal of the given matrix.
	 * @print arr[i][j]
	 */
	void printAllAboveTheMainDiagonal() {
		int arr[][] = {{1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {1, 2, 3, 4},
	            {5, 6, 7, 8}};

	    for (int i = 0; i < arr.length - 1; i++) {
	        for (int j = i + 1; j < arr.length; j++) {

	            System.out.print(arr[i][j] + " ");

	        }
	    }
	}
	
	/**
	 * This method to Invert the square matrix of the given integers on the main diagonal.
	 * towards.
	 * @print arr2[i][j]
	 */
	void invertTheSquareMatrix() {
		int arr1[][] = {{1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {1, 2, 3, 4},
	            {5, 6, 7, 8}};
	    int arr2[][] = new int[arr1.length][arr1.length];
	    for (int i = 0; i < arr1.length; i++) {
	        for (int j = 0; j < arr1.length; j++) {

	            System.out.print(arr2[i][j] = arr1[j][i]);
	        }
	    }
	}
	
	/**
	 * This method for the given square matrix of natural numbers, outputs YES if its .
	 * the sum of the elements of all rows is even. NO otherwise.
	 * @print yes or no
	 */
	void printsYesOrNo() {
		 int arr[][] = {{1, 2, 3, 5},
		            {5, 6, 7, 8},
		            {1, 2, 3, 4},
		            {5, 6, 7, 8}};
		    int summ = 0;
		    boolean a = false;
		    for (int i = 0; i < arr.length; i++) {
		        for (int j = 0; j < arr.length; j++) {
		            summ += arr[i][j];

		            }
		        if (summ % 2 == 0) {
		            a = true;
		        } else {
		            a = false;
		            break;
		        }
		    }
		    if (a) {
		        System.out.println("yes");
		    } else System.out.println("no");
	}
	

}
