package com.kiran.java.JunitSamples;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArrayEquals() {
		int num[] = { 12, 3, 4, 1 };
		int expected[] = { 1, 3, 4, 12 };
		Arrays.sort(num);
		assertArrayEquals(expected, num);
	}

	@Test(timeout = 100)
	public void testSortPerformance() {
		// timeout is used for testing whether 1000000 operations can be done in 100ms
		int arr[] = { 12, 23, 4 };
		for (int i = 0; i <= 1000000; i++) {
			arr[0] = i;
			Arrays.sort(arr);
		}
	}
}
