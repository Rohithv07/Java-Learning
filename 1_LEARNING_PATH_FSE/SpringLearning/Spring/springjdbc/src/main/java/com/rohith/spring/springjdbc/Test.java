package com.rohith.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rohith/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, 1, "rohith", "v");
		System.out.println("Records inserted are : " + result);
	}

}
