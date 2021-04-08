package com.kiran.java.JunitSamples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BeforeAfterTest.class, ExceptionsTest.class, StringHelperTest.class })
public class AllTests {

}
