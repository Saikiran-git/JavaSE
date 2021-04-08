package com.kiran.java.JunitSamples;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class BiggerAndSmallerTest {

	private BiggerAndSmaller bigSmall;

	@Before
	public void setUp() {
		bigSmall = new BiggerAndSmaller();
	}

	private int[] nums(int... ns) {
		return ns;
	}

	@Test
	public void numbersInIncreasingOrder() {
		bigSmall.find(nums(2, 3, 4));

		assertNumbers(4, 2);
	}
	
	private void assertNumbers(int bigger, int smaller) {
		Assert.assertEquals(bigger, bigSmall.getBigger());
		Assert.assertEquals(smaller, bigSmall.getSmaller());
	}

	@Test
	public void numbersInDecreasingOrder() {
		bigSmall.find(nums(4, 3, 2));

		assertNumbers(4, 2);
		
	}

	@Test
	public void numberInAnyOrder() {
		bigSmall.find(nums(19, 5, 2, 17, 15, 10));

		assertNumbers(19, 2);
	}

	@Test
	public void onlyOneNumber() {
		bigSmall.find(nums(16));

		assertNumbers(16, 16);
	}

	@Test
	public void repeatedNumber() {
		bigSmall.find(nums(16, 2, 16, 3, 4, 5, 15, 16));

		assertNumbers(16, 2);
	}

}