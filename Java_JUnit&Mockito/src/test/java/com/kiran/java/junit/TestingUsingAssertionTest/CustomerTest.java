package com.kiran.java.junit.TestingUsingAssertionTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.kiran.java.junit.TestingUsingAssertion.Customer;

public class CustomerTest {
    Customer c;
    
    @Test
    public void testAadhar(){
        c = new Customer("1234567891234567", "ab", "cd", "ef", 10000, "abcd@mail.com");
        assertFalse(c.isValidAadharNo("1234567891234567"));
    }
    @Test
    public void testName(){
        c = new Customer("823456789123", "ab", "cd", "ef", 10000, "abcd@mail.com");
        assertNotEquals(c.getFirstName(), c.getLastName());
    }
    @Test
    public void testEmail(){
        c = new Customer("1234567891234567", "ab", "cd", "ef", 10000, "abcd@mail.com");
        assertNotNull(c.getEmailId());
    }
}