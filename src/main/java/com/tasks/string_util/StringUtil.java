package com.tasks.string_util;

import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {
	
	/**
	 * 
	 * This method concats String
	 * @print stringBuilder
	 */
	public String stringConcatsMethod() {
		String a = "Hello";
		String b = "World";
		int c = 1;
		int d = 2;
		
//		System.out.println(a + b);
//		System.out.println(c + d + a + b);
//		System.out.println(Integer.toString(c) + d + a + b);
//		System.out.println(a + c + d + b);
//		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		
//		stringBuilder.append(b);
//		System.out.println(stringBuilder);
//		stringBuilder.append(c);
//		stringBuilder.append(d);
//		System.out.println(stringBuilder);
		
		return a+c+d+b;
	}
	
	
	/**
	 * This methods return the new line after every space
	 * @param str
	 * @return array of words
	 */
	
	String lineSplitNewLines(String str) {
		
		String arr[] = str.split(" ");
		
		for(int i = 0; i< arr.length -1; i++) {
			arr[i]+= "\n";
		}
		
		return Arrays.toString(arr);
	
	}
	
	/**
	 * This Method reverseString
	 * @param str
	 * @return String type
	 */
	
	public String reverseString(String str) {
		
		
		String[] arr = str.split("");
		str = "";
		
		for(int i = arr.length-1;i>=0;i--) {
			str += arr[i];
		}
		
		return str;
		
	}

	
	/**
	 * This method counts SubStrings
	 * @param str
	 * @param token
	 * @return int Count
	 */
	
	int countSubString(String str, String token) {
		
	int count = 0;
	int j = 0;
		
		String[] arr1 = str.split("");
		String[] arr2 = token.split("");
		
		for(int i = 0; i<arr1.length;i++) {
			j = 0;
			for(j = 0; j<arr2.length-1; j++) {
				if(arr1[i].equals(arr2[j]) ) {
					i++;
					j++;
					if(arr1[i].equals(arr2[j])) {
						count++;
						j = 0;
					}
				}
			}
		}
		
		return count;
	}
	
	/**
	 * This method changes str to UpperCase
	 * @param str
	 * @print str
	 */
	void upperCase(String str) {
		str = str.toUpperCase();
		System.out.println(str);
	}
	
	
	/**
	 * Method that reads a 20-character string from the console and prints it if the string
     * length is less than 20, then we must silence the line by writing less characters instead
     * The "*" symbol
	 * @print str
	 */
	public String method(String str) {
		
		
		for(int i = 0; i<str.length();i++) {
			if(str.length()<20) {
				for(int j = 0; j<20-str.length();j++) {
					str += "*";
				}
			}
		}
		return str;

	}
	
	/**
	 * This method remove the Character
	 * @param str
	 * @print str
	 * @print stringBuilder
	 */
	
	String removeCharacter(String str) {
		String[] arr = str.split("a");
		StringBuilder stringBuilder = new StringBuilder(str);
		str = "";
	for(int i = 0; i<arr.length; i++) {
		str += arr[i];
	}
		System.out.println(str);
		
		
		for(int i = 0; i<stringBuilder.length();i++) {
		if(stringBuilder.charAt(i) == 'a') {
			stringBuilder.deleteCharAt(i);
		}
		}
		System.out.println(stringBuilder);
		return str;
		
	}
	
	/**
	 * This method replaceCharacter
	 * @param str
	 * @print str
	 * @print stringBuilder
	 */
	
	String replaceCharacter(String str) {
		String[] arr = str.split("a");
		StringBuilder stringBuilder = new StringBuilder(str);
		str = "";
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == "a") {
				arr[i] = "*";
			}
			str+=arr[i];
		}
		
		System.out.println(str);
		
		for(int i = 0; i<stringBuilder.length();i++) {
			if(stringBuilder.charAt(i) == 'a') {
				stringBuilder.setCharAt(i, '*');
			}
		}
		System.out.println(stringBuilder);
		return str;
	}
	
	/**
	 * 
	 * This method find the longest substring of str
	 * @param str
	 * @print arr[index]
	 */
	
	String longestSubString(String str) {
		String[] arr = str.split(" ");
		int len = 0;
		int index = 0;
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i].length() > len) {
				len =arr[i].length();
				index = i;
			}
		}
		System.out.println(arr[index]);
		return str;
	}
	
	/**
	 * This method return the index of Character
	 * @param str
	 * @print index
	 */
	int indexOfChar(String str) {
		String[] arr = str.split("");
		int index = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("a")) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		return index;
	}
	
	/**
	 * Write a method, which finds and prints the given line from the beginning to the index
 	 * substring using String.
	 * @param str
	 * @param n
	 * @print arr[i]
	 */
	
	void toIndexBreak(String str,int n) {
		String[] arr = str.split("");
		
		
		for(int i = 0; i<arr.length; i++) {
			if(i == n) {
				break;
			}
			System.out.print(arr[i]);
		}
	}
	
	/**
	 *String null which checks if the given parameter is empty and not
	 * @param str
	 * @return true or false
	 */
	public boolean nullOrNot(String str) {
		
		if(!str.isEmpty() && str != null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/**
	 * This method return the largest SubString Index
	 * @param str
	 * @print arr[index]
	 */
	void largestSubString(String str) {
		
		String[] arr = str.split(",");
		int len = 0;
		int index = 0;
		for(int i = 0; i<arr.length; i++ ) {
			if(arr[i].length() > len) {
				len =arr[i].length();
				index = i;
			}
		}
		System.out.println(arr[index]);
		
	}

}
