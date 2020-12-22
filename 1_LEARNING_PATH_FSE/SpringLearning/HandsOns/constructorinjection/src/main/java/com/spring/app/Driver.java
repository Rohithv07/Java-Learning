package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Driver {
	
public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    MemberShip memberShip = (MemberShip) context.getBean("membership");
    System.out.println(memberShip);
    
}

}
