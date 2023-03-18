package com.tasks.homework15;

import java.util.Arrays;

public class BubbleSort {
	
	/**
	 * Constructor call sort
	 * @param data
	 */
	public BubbleSort(int[] data) {
		sort(data);
	}
	
	/**
	 * This method sort array
	 * @param data
	 * @return data
	 */
	public int[] sort(int[] data) {

	    int dataLength = data.length;
	    int swap;
	    boolean sorted;

	    for (int i = 0; i < dataLength; i++) {

	        sorted = true;

	        for (int a = 1; a < (dataLength - i); a++) {

	            if (data[a - 1] > data[a]) {
	                swap = data[a - 1];
	                data[a - 1] = data[a];
	                data[a] = swap;
	                sorted = false;
	            }
	        }
	        if (sorted) break;
	    }

	    return data;
	}
	
	

}
