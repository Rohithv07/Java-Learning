package com.cts.test;

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

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;

//Provide necessary Annotation to class, attributes and test methods
@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
	
	    @Mock
        Book book;
	    
	    @InjectMocks
        GenerateISBN service;
        
        @Rule
        public ExpectedException exceptionRule = ExpectedException.none();

	@Before
	public void setUp() throws Exception {
	    //assertNotNull(book);
	    //service = new GenerateISBN(book);
	    //when(service.assignISBN)
	}

	@After
	public void tearDown() throws Exception {
	}
    
    @Test
	public void testSuccess() {
	    	//fill code
	    	book = service.assignISBN("ISBN1234");
	    	verify(book, times(1)).setIsbn("ISBN1234");
	    	

	}
	
	@Test
	public void testFailed() throws RuntimeException {
	    	//fill code
	    	service = new GenerateISBN(book);
	    	verify(book, times(0)).setIsbn("a1234");
	    	

	}

    @Test
	public void testException() {
	    	//fill code
	    	exceptionRule.expect(RuntimeException.class);
	    	exceptionRule.expectMessage("Invalid Code");
	    	service.assignISBN("abcd");

	}
}
