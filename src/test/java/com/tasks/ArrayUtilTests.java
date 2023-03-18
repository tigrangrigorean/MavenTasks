package com.tasks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.tasks.homework8.ArrayUtil;

public class ArrayUtilTests {

	ArrayUtil arrayUtil = new ArrayUtil();

	@Test
	public void largestMemberTest() {
		
	
		long [] arr = new long[] {3l,4l,2l,6l};
		
		long max = 0;
		
		for(int i = 0; i<arr.length;i++) {
		if(max < arr[i]) {
			max = arr[i];
		}
		}
		
		Assert.assertEquals(arrayUtil.largestMember(arr),max);
	
	}
	
	@Test
	public void minValueArray() {
		
		float[] arr = new float[] {1.7f,2.1f,0.5f,3.4f};
		float min = Float.MAX_VALUE;
		
		for(int i = 0; i<arr.length;i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
		}
		
		Assert.assertEquals(arrayUtil.minValuePrint(arr), min, min);
	}
}
