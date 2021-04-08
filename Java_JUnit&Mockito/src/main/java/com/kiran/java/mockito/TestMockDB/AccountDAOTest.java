package com.kiran.java.mockito.TestMockDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import com.kiran.java.mockito.TestMockDB.AccountTransactionException;
import com.kiran.java.mockito.TestMockDB.AccountDAO;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.mockito.Mock;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

//Provide necessary Annotation to class, attributes and test methods

@SuppressWarnings("unused")
@RunWith(MockitoJUnitRunner.class)
public class AccountDAOTest {

    @Mock
	private DataSource ds;
    @InjectMocks
	private AccountDAO dao;
    @Mock
	private Connection con;
	@Mock
	private PreparedStatement ps;
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		//fill code
        when(ps.executeUpdate()).thenReturn(1);
        when(con.prepareStatement("UPDATE ACCOUNT SET balance = balance + ? WHERE accNo = ?")).thenReturn(ps);
        when(ds.getConnection()).thenReturn(con);
	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
	public void testInvalidAccount() throws AccountTransactionException {
    	//fill code
        exceptionRule.expect(AccountTransactionException.class);
        dao.deposit("", 100.0);
	}
    @Test
	public void testNullAccount() throws AccountTransactionException {
	   	//fill code
        exceptionRule.expect(AccountTransactionException.class);
        dao.deposit(null, 100.0);
	}
	@Test
	public void testInvalidAmount() throws AccountTransactionException {
	   	//fill code
        exceptionRule.expect(AccountTransactionException.class);
        dao.deposit("100", 0);
        dao.deposit("100", -1);
	}
	
	@Test
	public void testMethodCall() throws SQLException, AccountTransactionException {
	   	//fill code
        dao.deposit("100", 100);

        verify(ps, times(1)).executeUpdate();
        verify(con, times(1)).prepareStatement(anyString());
        verify(ds, times(1)).getConnection();
	}
}
