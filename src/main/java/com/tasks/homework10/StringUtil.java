package com.tasks.homework10;

import java.util.Arrays;

public class StringUtil {

	
	/**
	 * Given a string, return a string made of the first 2 chars (if present), however 
	 * include first char only if it is 'o' and include the second only if it is 'z', so 
	 * "ozymandias" yields "oz".
	 * @param str
	 * @print str
	 */
	
	void searchCharacters(String str) {
		String[] arr = str.split("");
		str = "";
		int i = 0;
		
		while(true) {
			if(arr[0].equalsIgnoreCase("o")) {
				str += "o";
				if(arr[1].equalsIgnoreCase("z")) {
					str += "z";
					break;
				}
				break;
			}
			else {
				str += arr[0] + arr[1];
				break;
			}
		}
		System.out.println(str);
		
	}
	
	/**
	 *
	 * Count the number of "xx" in the given string. We'll say that overlapping is 
	 * allowed, so "xxx" contains 2 "xx".
	 * 
	 * @param str
	 * @param token
	 * @print count
	 */
	void containsOrNot(String str,String token) {
		
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
			System.out.println(count);
		
	}
			
	
	/**
	 * This method detect's String is palindrome or not
	 * @param str1
	 * @return true or false
	 */
	boolean palindrom(String str1) {
		StringBuilder stringBuilder = new StringBuilder(str1);
		
		String str2 = stringBuilder.reverse().toString();
		
		if(str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Given a list of strings, write a method that returns a list of all strings that 
	 * start with the letter 'a' (lower case) and have exactly 3 letters.
	 * @param arr
	 * @print arr[i]
	 */
	void containsCharacterA(String [] arr) {
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].charAt(0) == 'a') {
				System.out.println(arr[i]);
			}
		}
	}
	
	/**
	 * Write a method that returns a comma-separated string based on a given list 
	 * of integers. Each element should be preceded by the letter 'e' if the number 
	 * is even, and preceded by the letter 'o' if the number is odd.
	 * @param num
	 * @print str
	 */
	void printSymbolAndLetter(int ... num) {
		String str = "";
		for(int i = 0; i<num.length;i++) {
			if(num[i]%2 == 0) {
				str += "e" + num[i] + ",";
			}
			else {
				str += "o" + num[i] + ",";
			}
		}
		System.out.println(str);
	}
	
	/**
	 * This method to realize the Caesar's cipher
	 * @param text
	 * @print str
	 */
	void caesarsCipher(String text) {
		
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		String str = "";
		String[] textArr = text.split("");
		
		String [] arr = alphabet.split("");
		Arrays.sort(arr);
		
		for(int i = 0; i<textArr.length; i++) {
			if(arr[i] != " ") {
				if(Arrays.binarySearch(arr, textArr[i]) >= 5) {
					str += arr[Arrays.binarySearch(arr, textArr[i]) - 5];
				}
				else {
					str += arr[arr.length - (5-Arrays.binarySearch(arr, textArr[i]))];
				}
			}
		}
		System.out.println(str);
		
	}
	
	/**
	 * A palindrome is a word which reads the same backward or forward. 'abcba' is 
	 * a palindrome. Write a method that returns the longest palindrome substring 
	 * of a given string
	 * @param str
	 * @print str.charAt(i)
	 */
	
	void palindromeSubString(String str) {
		int startIndex = 0;
		int count = 0;
		String [] arr = str.split("");
		if(palindrom(str)) {
			for(int i = 0; i<arr.length - 1 ; i++) {
				if(str.charAt(i) < str.charAt(i+1)) {
					System.out.println(str.charAt(i));
				}
			}
			
	
		}
	}
	
	/**
	 * Given two strings, find the number of common characters between them.
	 * @param str1
	 * @param str2
	 * @print count
	 */
	void commonCharacters(String str1,String str2) {
		int j=0;
		int count = 0;
		for(int i = 0; i<str1.length(); i++) {
			for(j = 0; j<str2.length();j++) {
				if(str1.charAt(i) == str1.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(count);
			
		
	}
	

}
