package com.example.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	MyMath mymath = new MyMath();
	
	@Before
	public void testBeforeMethod() {
		System.out.println("Before");
	}
	
	@After
	public void testAfterMethod() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void testBeforeClassMethod() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void testAfterClassMethod() {
		System.out.println("After Class");
	}
	

	@Test
	public void sumWith3Numbers() {
		System.out.println("1");
		assertEquals(3, mymath.sum(new int[] { 1, 1, 1 }));
	}

	@Test
	public void sumWith1Numbers() {
		System.out.println("2");
		assertEquals(1, mymath.sum(new int[] { 1 }));
	}

}
