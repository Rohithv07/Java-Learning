package com.in28minutes.junit.helper.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	// Arrays.sort()

	@Test
	public void testArraySortSuccess() {
		int[] numbers = { 12, 4, 3, 1 };
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test
	public void testArraySortFail() {
		int[] numbers = { 12, 4, 3, 1 };
		int[] expected = { 1, 4, 3, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArrayException_Null() {
		int[] numbers = null;
		int[] expected = { 1, 3, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(timeout = 100)
	public void testSort_Performance() {
		int [] array = {12, 23, 4};
		for(int i=1; i<=1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
