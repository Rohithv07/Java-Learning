package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.in28minutes.login.LoginService;

@Controller
public class LoginController {

	// set the login service through autowiring
	@Autowired
	LoginService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginMessage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, ModelMap model, @RequestParam String password) {
		if (service.validateUser(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
		model.put("errorMessage", "Please recheck the credentials");
		return "login";
	}

}

// model is something thing we passed between controller and view.
