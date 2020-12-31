package com.rohith.business.spydemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	// spy is also called partial mock
	// avoid spy in real world projects
	@Test
	public void test() {
		List arrayListSpy = spy(ArrayList.class);
		assertEquals(0, arrayListSpy.size());
		// mocks return default value
		stub(arrayListSpy.size()).toReturn(5);
		// assertEquals(5, arrayListSpy.size());
		// assertEquals(6, arrayListSpy.size()); // now the test fails
		arrayListSpy.add("Dummy"); // since we are using spy instead of mock, the size changes
		assertEquals(1, arrayListSpy.size());
		verify(arrayListSpy).add("Dummy");

	}

}
