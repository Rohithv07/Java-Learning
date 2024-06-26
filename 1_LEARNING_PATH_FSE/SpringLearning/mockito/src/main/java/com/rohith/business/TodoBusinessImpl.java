package com.rohith.business;

import java.util.ArrayList;
import java.util.List;

import com.rohith.data.api.TodoService;

public class TodoBusinessImpl {
	private TodoService todoService;

	// TodoService dependency
	// so we may not be having access to this interface
	// so we need to create a stub to test the method in this class

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);
		for (String todo : todos) {
			if (todo.contains("Spring"))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}
	public void deleteTodosNotRelatedToSpring(String user) {
		List<String> allTodos = todoService.retrieveTodos(user);
		for (String todo : allTodos) {
			if (!todo.contains("Spring")) {
				todoService.deleteTodo(todo);
			}
		}
	}
}
