package com.kiran.java.junit.ProductLoginTestSuiteTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginTest.class, ProductTest.class })
public class TestSuiteRunner {

}
