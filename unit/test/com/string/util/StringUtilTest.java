package com.string.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author camilolopes
 * 
 */
public class StringUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRemoveDuplicateCharFromString() {
		String value = "AABCC";
		String expectedResult = "ABC";
		assertEquals(expectedResult, StringUtil.removeDuplicateCharacter(value));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRemoveDuplicateCharException() {
		StringUtil.removeDuplicateCharacter(null);
	}
}
