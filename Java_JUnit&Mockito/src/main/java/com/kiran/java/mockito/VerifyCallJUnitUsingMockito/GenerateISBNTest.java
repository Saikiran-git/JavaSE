package com.kiran.java.mockito.VerifyCallJUnitUsingMockito;

import org.junit.After;
import org.junit.Before;
import org.junit.rules.ExpectedException;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.*;

//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
	@Mock
    Book book;

    @InjectMocks
    GenerateISBN service;
    
    @SuppressWarnings("deprecation")
	@Rule
    public ExpectedException exceptionRule = ExpectedException.none();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
    
    @Test
	public void testSuccess() {
	    	//fill code
	    	String expected = "ISBN0000";
            service.assignISBN(expected);
            verify(book, times(1)).setIsbn(expected);
	}
	
	@Test
	public void testFailed() {
	    	//fill code
            exceptionRule.expect(RuntimeException.class);
            String unexpected = "ISBN0";
            service.assignISBN(unexpected);
            verify(book, times(0)).setIsbn(unexpected);
	}

    @Test
	public void testException() {
	    	//fill code
            exceptionRule.expect(RuntimeException.class);
            exceptionRule.expectMessage("Invalid Code");
            String unexpected = "ISBN2";
            service.assignISBN(unexpected);
            verify(book, times(0)).setIsbn(unexpected);
	}
}
