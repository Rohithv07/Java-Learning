package com.rohith.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.rohith.data.api.TodoService;

public class TodoBusinessImplMockTest {

	// what is mocking ?
	// mocking is creating objects that simulate behavior of real objects.
	// unlike stubs, mocks are dynamic created at run time.
	// offers more functionality.
	// can verify method calls and other things.

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring", "Spring mvc", "Learn to dance");
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_EmptyList() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(0, filteredTodos.size());
	}
	

	/*
	 * @Test public void testRetrieveTodosRelatedToSpring_usingAStubCheckEquality()
	 * { TodoService todoServiceStub = new TodoServiceStub(); TodoBusinessImpl
	 * todoBusinessImpl = new TodoBusinessImpl(todoServiceStub); List<String>
	 * filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	 * assertEquals("Learn Spring", filteredTodos.get(0)); }
	 */

}
