package com.rohith.data.api;

import java.util.List;

// create todoservicestub
// test todobusinessimpl using todoservicestub
public interface TodoService {
	public List<String> retrieveTodos(String user);
	public void deleteTodo(String todo);
}
