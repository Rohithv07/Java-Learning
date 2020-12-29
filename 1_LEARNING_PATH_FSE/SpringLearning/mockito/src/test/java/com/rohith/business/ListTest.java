package com.rohith.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}

	@Test
	public void letsMockListSizeMethod_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}

	@Test
	public void letsMockListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("twentyonepilot");
		assertEquals("twentyonepilot", listMock.get(0));

	}

	@Test
	public void letsMockListGetMethod_ArgumentMatcher() {
		List listMock = mock(List.class);
		// Argument matcher
		when(listMock.get(anyInt())).thenReturn("twentyonepilot");
		assertEquals("twentyonepilot", listMock.get(0));
		assertEquals("twentyonepilot", listMock.get(123));

	}

	@Test(expected = RuntimeException.class)
	public void letsMockListGetMethod_ThrowException() {
		List listMock = mock(List.class);
		// Argument matcher
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something went wrong"));
		listMock.get(0);

	}

	@Test
	public void letsMockListGetMethod_UsingBDD() {
		// given
		List listMock = mock(List.class);
		given(listMock.get(0)).willReturn("twentyonepilot");

		// when
		String firstElement = (String) listMock.get(0);

		// then
		assertThat(firstElement, is("twentyonepilot"));

	}

}
