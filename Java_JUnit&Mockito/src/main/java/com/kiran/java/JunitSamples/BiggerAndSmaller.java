package com.kiran.java.JunitSamples;

public class BiggerAndSmaller {
	private int bigger = Integer.MIN_VALUE;
	private int smaller = Integer.MAX_VALUE;

	public void find(int[] numbers) {
		for (int i : numbers) {
			if (i > bigger)
				bigger = i;
			if (i < smaller)
				smaller = i;
		}
	}
	
	public int getBigger() {
		return bigger;
	}
	
	public int getSmaller() {
		return smaller;
	}
	
}
