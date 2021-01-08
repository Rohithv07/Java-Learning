package com.cognizant.bmi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cognizant.bmi.bean.User;

@Service
public class BMIService {

	public static List<String> genderType = new ArrayList<String>();
	public static Map<Integer, User> userList = new HashMap<>();
	private static int userId = 1000;

	public BMIService() {
		genderType.add("Male");
		genderType.add("Female");
		genderType.add("Others");
	}

//add the code as per the requirement

	public User addUserDetails(User user) {
		userId += 1;
		user.setUserId(userId);
		userList.put(userId, user);
		return user;
	}

	public double calculateBMI(User user) {
		// multiplication by 100*100 for cm to m conversion
		double bmi = (100 * 100 * user.getWeight()) / (user.getHeight() * user.getHeight());

		return Math.ceil(bmi);
	}

	public String getBMIStatus(double bmi) {
		if (bmi < 18.5)
			return "You are Underweight";
		if (bmi >= 18.5 && bmi < 25)
			return "You are Normal";
		if (bmi >=25 && bmi < 30)
			return "You are Overweight";
		return "You are Obese";
		
	}

}
