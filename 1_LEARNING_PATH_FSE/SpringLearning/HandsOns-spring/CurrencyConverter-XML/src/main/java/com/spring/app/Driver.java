package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {


	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("beans.xml");
		CurrencyConverter converter = (CurrencyConverter) obj.getBean("currencyConverter");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int value=converter.getTotalCurrencyValue(s);
		System.out.println(value);
	}

}