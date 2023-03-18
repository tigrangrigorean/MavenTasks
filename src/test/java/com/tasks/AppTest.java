package com.tasks;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;

import com.tasks.homework15.BubbleSort;
import com.tasks.homework15.HeapSort;
import com.tasks.homework15.InsertionSort;
import com.tasks.homework15.MergeSort;
import com.tasks.homework15.QuickSort;
import com.tasks.homework15.SelectionSort;
import com.tasks.homework8.ArrayUtil;
import org.junit.Test;

public class AppTest {

	@Test
	public void bubbleSortTest() {
		int [] arr = new int[] {3,1,4,2,7,5};
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		BubbleSort bubbleSort = new BubbleSort(arr);
		
		assertArrayEquals(arr, arr2);
	}
	
	@Test
	public void selectionSortTest() {
		int [] arr = new int[] {3,1,4,2,7,5};
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		
		SelectionSort selectionSort = new SelectionSort(arr);
		
		assertArrayEquals(arr, arr2);
	}
	
	@Test
	public void insertionSortTest() {
		int [] arr = new int[] {3,1,4,2,7,5};
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		
		InsertionSort insertionSort = new InsertionSort(arr);
		assertArrayEquals(arr, arr2);
	}
	
	@Test
	public void mergeSortTest() {
		int [] arr = new int[] {3,1,4,2,7,5};
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		
		MergeSort mergeSort = new MergeSort(arr);
		assertArrayEquals(arr, arr2);
	}
	
	@Test
	public void quickSortTest() {
		int [] arr = new int[] {3,1,4,2,7,5};
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		
		QuickSort quickSort = new QuickSort(arr);
		assertArrayEquals(arr, arr2);
	}
	
	@Test
	public void heapSortTest() {
		int [] arr = new int[] {3,1,4,2,7,5};
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr2);
		
		HeapSort heapSort = new HeapSort(arr);
		assertArrayEquals(arr, arr2);
	}

}
