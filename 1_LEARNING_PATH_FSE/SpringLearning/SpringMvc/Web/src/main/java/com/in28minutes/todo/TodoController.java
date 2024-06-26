package com.in28minutes.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;

@Controller
public class TodoController {

	// set the login service through autowiring
	@Autowired
	TodoService service;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodo(ModelMap model) {
		model.addAttribute("todos", service.retrieveTodos("in28Minutes"));
		return "list-todos";
	}

}

// model is something thing we passed between controller and view.
