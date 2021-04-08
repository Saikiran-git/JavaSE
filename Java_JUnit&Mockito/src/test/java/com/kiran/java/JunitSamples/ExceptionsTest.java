package com.kiran.java.JunitSamples;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

@SuppressWarnings("unused")
public class ExceptionsTest {

	@Test(expected = NullPointerException.class)
	public void testExceptions() {
		int num[] = null;
		Arrays.sort(num);
	}

}
