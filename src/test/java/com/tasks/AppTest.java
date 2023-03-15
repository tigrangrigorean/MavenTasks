package com.tasks;

import static org.junit.Assert.*;

import org.junit.Assert;

import com.tasks.homework8.ArrayUtil;
import org.junit.Test;

public class AppTest {

	@Test
	public void arrayUtiltestCase() {
	
	ArrayUtil arrayUtil = new ArrayUtil();	
	
	assertNotNull(arrayUtil.sumOfTwoArrays());
	assertEquals(arrayUtil.sumOfTwoArrays().length,4);
	}

}
