package com.tasks.sorts;

import java.util.Arrays;

public class InsertionSort {
	
	/**
	 * Constructor calls sort method
	 * @param data
	 */
	public InsertionSort(int data[]) {
		sort(data);
	}

	/**
	 * This method sort array
	 * @param data
	 * @return
	 */
	 int[] sort(int data[])
	    {
	        int n = data.length;
	        for (int i = 1; i < n; ++i) {
	            int key = data[i];
	            int j = i - 1;
	 
	            while (j >= 0 && data[j] > key) {
	                data[j + 1] = data[j];
	                j = j - 1;
	            }
	            data[j + 1] = key;
	        }
	        return data;
	    }
	
}
