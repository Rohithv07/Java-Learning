package com.rohith.spring.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rohith.spring.data.table.Student;
import com.rohith.spring.data.table.StudentRepo;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepo studentRepo) {
		return args -> {
			Student student1 = new Student("Rohith", "V", "rohith@mail.com", 22);
			studentRepo.save(student1);
			studentRepo.findById((long) 1);
		};
	}

}
