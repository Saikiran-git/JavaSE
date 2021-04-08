package com.kiran.java.junit.ProductLoginTestSuiteTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kiran.java.junit.ProductLoginTestSuite.Login;
import com.kiran.java.junit.ProductLoginTestSuite.LoginDAO;

public class LoginTest {

    //Write the code for adding and deleting Login data
    
    LoginDAO dao = new LoginDAO();
    
    @Test
    public void testMethod(){
        Login l1 = new Login("ABCD", "1234");
        Login l2 = new Login("WXYZ", "2345");
        
        assertTrue(dao.addLogin(l1));
        assertFalse(dao.addLogin(null));
        
        l1.setUserName("abcd");
        l1.setPassword("1357");
        
        assertTrue(dao.deleteLogin(l1));
        assertFalse(dao.deleteLogin(l2));
        assertFalse(dao.deleteLogin(null));
    }
    
}

