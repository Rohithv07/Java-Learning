package com.cts.bank.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
 

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;  
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;  

import com.cts.bank.dao.AccountDAO;
import com.cts.bank.exception.AccountTransactionException;

//Provide necessary Annotation to class, attributes and test methods
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
	
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		//fill code
		assertNotNull(ds);
		dao = new AccountDAO(ds);
		when(ds.getConnection()).thenReturn(con);
		when(con.prepareStatement(any(String.class))).thenReturn(ps);

	}

	@After
	public void tearDown() throws Exception {
	}

    @Test
	public void testInvalidAccount() throws AccountTransactionException {
	    	//fill code
	    	exceptionRule.expect(AccountTransactionException.class);
	    	exceptionRule.expectMessage("Invalid account number");
	    	dao.deposit("", 122);

	}

    @Test
	public void testNullAccount() throws AccountTransactionException {
	   	 //fill code
	   	 exceptionRule.expect(AccountTransactionException.class);
	   	 exceptionRule.expectMessage("Invalid account number");
	   	 dao.deposit(null, 122);
	   	 

	}
	
	@Test
	public void testInvalidAmount() throws AccountTransactionException {
	   	 //fill code
	   	 exceptionRule.expect(AccountTransactionException.class);
	   	 exceptionRule.expectMessage("Invalid amount");
	   	 dao.deposit("abc", 0);

	}
	
	@Test
	public void testMethodCall() throws SQLException, AccountTransactionException {
	   	 //fill code
	   	 con = ds.getConnection();
	   	 ps = con.prepareStatement("update account set balance = balance + ? where accNo = ?");
	   	 ps.executeUpdate();
	   	 verify(ds, times(1)).getConnection();
	   	 verify(con, times(1)).prepareStatement("update account set balance = balance + ? where accNo = ?");
	   	 verify(ps, times(1)).executeUpdate();
	   	 assertFalse(dao.deposit("12", 122));

	}
}
