package com.example.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals(1, 1);
		assertTrue(1==1);
		assertFalse(1==2);
		assertNotNull(new Integer(1));
		assertArrayEquals(new int [] {1,2}, new int [] {1,3});
	}

}
