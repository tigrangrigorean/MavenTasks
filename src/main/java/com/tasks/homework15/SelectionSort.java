package com.tasks.homework15;

import java.util.Arrays;

public class SelectionSort {
	
	/**
	 * Constructor call sort
	 * @param data
	 */
	public SelectionSort(int[] data) {
		sort(data);
		
	}
	
	
	/**
	 * This method sort array
	 * @param data
	 * @return
	 */
	    public static int[] sort(int[] data) {
	        for (int i = 0; i < data.length; i++) {   
	            int pos = i;
	            int min = data[i];
	          
	            for (int j = i + 1; j < data.length; j++) {
	                if (data[j] < min) {
	                    pos = j;   
	                    min = data[j];
	                }
	            }
	            data[pos] = data[i];
	            data[i] = min;  
	        
	    }
	        return data;
	}

}
