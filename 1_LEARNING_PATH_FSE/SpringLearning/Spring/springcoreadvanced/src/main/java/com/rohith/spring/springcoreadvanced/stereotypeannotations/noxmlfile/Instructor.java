package com.rohith.spring.springcoreadvanced.stereotypeannotations.noxmlfile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // this time the scope turns to be prototype
public class Instructor {
	@Value("20")
	private int id;
	@Value("rohi") // assigns the values to primitive types and override the values given already.
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	

}
