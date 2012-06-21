package com.string.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author camilolopes
 * 
 */
public class StringUtilTest {

	private String value;
	private String expectedResult;
	@Before
	public void setUp() throws Exception {
		value = "AABCC";
	}

	@Test
	public void testRemoveDuplicateCharFromString() {
		expectedResult = "ABC";
		assertEquals(expectedResult, StringUtil.removeDuplicateCharacter(value));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRemoveDuplicateCharException() {
		StringUtil.removeDuplicateCharacter(null);
	}
	@Test
	public void testRemoveDuplicateCharIgnoreCase(){
		expectedResult = "abc";
		assertEquals(expectedResult,StringUtil.removeDuplicateCharIgnoreCase(value));
	}
}
