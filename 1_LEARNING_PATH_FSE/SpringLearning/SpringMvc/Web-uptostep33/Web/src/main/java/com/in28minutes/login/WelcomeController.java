package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class WelcomeController {

	// set the login service through autowiring


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginMessage(ModelMap model) {
		model.put("name", "rohith");
		return "welcome";
	}


}

// model is something thing we passed between controller and view.
