package com.kiran.java.junit.ProductLoginTestSuiteTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.kiran.java.junit.ProductLoginTestSuite.Product;
import com.kiran.java.junit.ProductLoginTestSuite.ProductDAO;

public class ProductTest {

    //Write the code for test methods
    ProductDAO dao = new ProductDAO();
	
    @Test
    public void testMethod(){
        Product p1 = new Product("1234", "ABCD", 30.0);
        Product p2 = new Product("2345", "WXYZ", 20.0);
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = null;

        
        assertTrue(dao.addProduct(p1));
        assertTrue(dao.addProduct(p2));
        assertTrue(dao.addProduct(p3));
        assertFalse(dao.addProduct(p5));
        
        p1.setPrice(20.0);
        
        assertTrue(dao.deleteProduct(p1));
        assertTrue(dao.deleteProduct(p2));
        assertTrue(dao.deleteProduct(p3));
        assertFalse(dao.deleteProduct(p4));
        assertFalse(dao.deleteProduct(p5));
    }

}
