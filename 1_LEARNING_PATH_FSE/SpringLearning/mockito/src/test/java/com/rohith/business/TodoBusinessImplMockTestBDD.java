package com.rohith.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.rohith.data.api.TodoService;

public class TodoBusinessImplMockTestBDD {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingBDD() {

		// given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring", "Spring mvc", "Learn to dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		// when
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");

		// then
		assertThat(filteredTodos.size(), is(2));
	}

	@Test
	public void testRetrieveTodosNotRelatedToSpring_UsingBDD() {
		// given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring", "Spring mvc", "Learn to dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
		verify(todoServiceMock).deleteTodo("Learn to dance"); // verify method is called
		verify(todoServiceMock, never()).deleteTodo("Spring mvc"); // verify method is not called.
		verify(todoServiceMock, times(1)).deleteTodo("Learn to dance"); // checks how many times to be called.
		then(todoServiceMock).should(never()).deleteTodo("Spring mvc"); // then syntax instead of verify

	}

	@Test
	public void testRetrieveTodosNotRelatedToSpring_UsinBDD_argumentCapture() {

		// declare an argument capture
		ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

		// define argument capture on specific method call
		// capture the argument

		// given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring", "Spring mvc", "Learn to dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
		then(todoServiceMock).should().deleteTodo(stringArgumentCaptor.capture());
		assertThat(stringArgumentCaptor.getValue(), is("Learn to dance"));

	}

	@Test
	public void testRetrieveTodosNotRelatedToSpring_UsinBDD_argumentCapture_multipleTimes() {

		// declare an argument capture
		ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

		// define argument capture on specific method call
		// capture the argument

		// given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Rock", "Spring mvc", "Learn to dance");
		given(todoServiceMock.retrieveTodos("dummy")).willReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

		// when
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");

		// then
		then(todoServiceMock).should(times(2)).deleteTodo(stringArgumentCaptor.capture()); // use times()
		assertThat(stringArgumentCaptor.getAllValues().size(), is(2)); // use getAllValues() for capturing all values

	}

}
