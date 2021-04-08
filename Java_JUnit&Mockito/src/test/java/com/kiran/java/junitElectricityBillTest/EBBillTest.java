package com.kiran.java.junitElectricityBillTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kiran.java.junit.ElectricityBill.EBBill;

import static org.junit.Assert.assertEquals;

public class EBBillTest {
	EBBill e;

	@Test
	public void test1() {
		e = new EBBill(50);
		assertEquals((50.0 * 2.60), e.calculateBillAmount(), 0);
	}

	@Test
	public void test2() {
		e = new EBBill(51);
		assertEquals((130.0 + (3.25)), e.calculateBillAmount(), 0);
	}

	@Test
	public void test3() {
		e = new EBBill(101);
		assertEquals((130 + 162.50 + ((101.0 - 100.0) * 5.26)), e.calculateBillAmount(), 0);
	}

	@Test
	public void test4() {
		e = new EBBill(201);
		assertEquals((130 + 162.50 + 526 + ((201 - 200) * 7.75)), e.calculateBillAmount(), 0);
	}

	@Test
	public void test5() {
		e = new EBBill(1000);
		assertEquals((130 + 162.50 + 526 + ((1000 - 200) * 7.75)), e.calculateBillAmount(), 0);
	}

	@Test
	public void test6() {
		e = new EBBill(1001);
		assertEquals((130 + 162.50 + 526 + 6200 + ((1001 - 1000) * 10)), e.calculateBillAmount(), 0);
	}

	@Test
	public void test7() {
		e = new EBBill(-1);
		assertEquals(0.0, e.calculateBillAmount(), 0);
	}

}
