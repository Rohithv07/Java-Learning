package com.in28minutes.junit.helper.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("We are starting our test, hang on");
	}

	@Before
	public void setup() {
		System.out.println("Before test");
	}

	@After
	public void afterSetup() {
		System.out.println("Afeter test");
	}

	@Test
	public void test1() {
		System.out.println("test1 executed");
	}

	@Test
	public void test2() {
		System.out.println("test2 executed");
	}

}
