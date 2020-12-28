package com.in28minutes.junit.helper.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.in28minutes.junit.helper.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Hang on we are starting our test");
	}

	String input;
	String expectedOutput;

	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	StringHelper stringHelper;
	

	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expectedOutputs = { { "AACD", "CD" }, { "ACD", "CD" } };
		return Arrays.asList(expectedOutputs);
	}

	@Before
	public void before() {
		stringHelper = new StringHelper();
		System.out.println("Object created");
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals(expectedOutput, stringHelper.truncateAInFirst2Positions(input));
		// expected, actual

	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPostion() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_NoAInString() {
		assertEquals("CDEF", stringHelper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinLastPosition() {
		assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NotSame() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Same() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Length2() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Length1() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}

	@After
	public void after() {
		System.out.println("testing completed");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("Hold ma beer, testing completed");
	}

}
