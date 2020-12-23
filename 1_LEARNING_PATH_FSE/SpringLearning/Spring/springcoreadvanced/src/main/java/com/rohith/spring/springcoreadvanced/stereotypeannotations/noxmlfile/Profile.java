package com.rohith.spring.springcoreadvanced.stereotypeannotations.noxmlfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {
	
	@Value("Java Demos")
	private String title;
	@Value("vazhathody")
	private String comp;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "Profile [title=" + title + ", comp=" + comp + "]";
	}
	
}
