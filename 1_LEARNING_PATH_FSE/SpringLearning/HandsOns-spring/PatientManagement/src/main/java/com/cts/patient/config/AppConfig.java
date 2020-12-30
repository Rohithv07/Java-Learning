package com.cts.patient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.cts.patient.model.Patient;
import com.cts.patient.service.PatientService;

//fill the code
@Configuration
@ComponentScan("com.cts.patient")
public class AppConfig {

	//fill the code
	@Bean
	public PatientService patientService() {
		return new PatientService();
	}
	
	@Bean
	public Patient patient() {
		return new Patient();
	}
	
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		propertySourcesPlaceholderConfigurer.setLocations(new ClassPathResource("patient_details.properties"));
		return propertySourcesPlaceholderConfigurer;
	}
}
