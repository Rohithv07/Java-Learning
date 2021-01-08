package com.cognizant;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeService {

	public String calculateAge(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateOfBirth = LocalDate.parse(date, formatter);
		LocalDate todayDate = LocalDate.now();
		Period difference = Period.between(dateOfBirth, todayDate);
		return "you are " + difference.getYears() + " years, " + difference.getMonths() + " months, "
				+ difference.getDays() + " days old.";
	}
}
