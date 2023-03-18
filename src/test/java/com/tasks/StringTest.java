package com.tasks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.tasks.homework9.StringUtil;

public class StringTest {
	
	StringUtil stringUtil = new StringUtil();

	
	@Test
	public void isConcatResultTrue() {
		assertEquals(stringUtil.stringConcatsMethod(), "Hello12World");
	}

	@Test
	public void isReverseStringTestTrue() {
		String str = "aefc";
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.reverse();
		
		assertEquals(stringUtil.reverseString(str),stringBuilder.toString());
	}
	
	@Test
	public void methodTestTrue() {
		String stroka = "*******************";
		
		assertEquals(stringUtil.method("a"), stringUtil.method("a").charAt(0) + stroka);
	}
	
	@Test
	public void nullOrNotTestTrue() {
		
		String str = "test";
		assertTrue(stringUtil.nullOrNot(str));
		
	}
}
