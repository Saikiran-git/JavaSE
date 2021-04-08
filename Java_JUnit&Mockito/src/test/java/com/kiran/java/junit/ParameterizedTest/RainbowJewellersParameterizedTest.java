package com.kiran.java.junit.ParameterizedTest;

import com.kiran.java.junit.Parameterized.RainbowJewellers;
import com.kiran.java.junit.Parameterized.RainbowJewellersService;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.kiran.java.junit.Parameterized.RainbowJewellersService;

@RunWith(Parameterized.class)
@SuppressWarnings("unused")
public class RainbowJewellersParameterizedTest {

	private double gram;
	private double expectedGoldPrice;

	RainbowJewellersService rj = new RainbowJewellersService();

	public RainbowJewellersParameterizedTest(double gram, double expectedGoldPrice) {
		super();
		this.gram = gram;
		this.expectedGoldPrice = expectedGoldPrice;
	}

	@SuppressWarnings("rawtypes")
	@Parameters
	public static Collection testCondition() {
		return Arrays.asList(new Object[][] { { 9.6, 48401.76 }, { 56.0, 282343.6 }, { 24.5, 123525.325 }, { 0, 0.0 },
				{ -1, -5041.85 } });
	}

	@Test
	public void testCalculateGoldPrice() {
		assertEquals(expectedGoldPrice, rj.calculategoldprice(gram), 0);
	}

}
