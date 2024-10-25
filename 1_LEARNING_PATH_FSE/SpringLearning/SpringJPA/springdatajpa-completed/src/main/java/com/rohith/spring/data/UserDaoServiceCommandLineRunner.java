package com.rohith.spring.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rohith.spring.data.entity.User;
import com.rohith.spring.data.entity.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

	@Autowired
	private UserDAOService userDAOService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		userDAOService.insert(user);
		log.info("New user is created : " + user);
	}

}
