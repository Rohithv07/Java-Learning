package com.rohith.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.rohith.data.api.TodoService;

// @RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockitoInjectMockTest {

	@Rule // there can be multiple rules but only one RunWith
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Rule
	public MockitoRule mockitoRule2 = MockitoJUnit.rule();

	@Mock
	TodoService todoServiceMock; // same as TodoService todoServiceMock = mock(TodoService.class);

	@InjectMocks
	TodoBusinessImpl todoBusinessImpl; // same as TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl()

	@Captor
	ArgumentCaptor<String> stringArgumentCaptor; // same as ArgumentCaptor<String> stringArgumentCaptor =
													// ArgumentCaptor.forClass(String.class);

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		List<String> todos = Arrays.asList("Learn Spring", "Spring mvc", "Learn to dance");
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_EmptyList() {
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("dummy")).thenReturn(todos);
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(0, filteredTodos.size());
	}

	@Test
	public void testRetrieveTodosNotRelatedToSpring_UsinBDD_argumentCapture_multipleTimes() {

		// declare an argument capture

		// define argument capture on specific method call
		// capture the argument

		// given
		List<String> todos = Arrays.asList("Learn Rock", "Spring mvc", "Learn to dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);

		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
		then(todoServiceMock).should(times(2)).deleteTodo(stringArgumentCaptor.capture()); // use times()
		assertThat(stringArgumentCaptor.getAllValues().size(), is(2)); // use getAllValues() for capturing all values

	}

}
