package com.kiran.java.JunitSamples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class BeforeAfterTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}

	@Before
	public void setup() {
		// Before runs before every test method
		System.out.println("Before test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

	@After
	public void teardown() {
		// After runs after every test method
		System.out.println("After test");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}

}
