package com.rohith.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {
	
	// problems on stub
	// 1. Maintenance
	// 2. Dynamic condition

	public List<String> retrieveTodos(String user) {

		return Arrays.asList("Learn Spring", "Spring mvc", "Learn to dance");
	}

	public void deleteTodo(String todo) {
		// TODO Auto-generated method stub
		
	}

}
