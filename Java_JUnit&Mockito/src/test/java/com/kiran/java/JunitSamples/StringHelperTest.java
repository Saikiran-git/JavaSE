package com.kiran.java.JunitSamples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class StringHelperTest {

	StringHelper helper;

	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testtruncateAInFirst2Positions1_AinFirst2Positions() {
		// fail("Not yet implemented");
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// assertEquals checks whether expected and actual results are matching
	}

	@Test
	public void testtruncateAInFirst2Positions2_AinFirst1Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testAreFirstAndLast2CharAreSame1() {
		// assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		// assertFalse checks whether expected result is false
	}

	@Test
	public void testAreFirstAndLast2CharAreSame2() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	

}