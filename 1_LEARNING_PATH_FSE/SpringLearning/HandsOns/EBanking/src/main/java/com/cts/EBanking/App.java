package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		//Configuration and Input data read here
		//Refer sample input details
		
		Scanner scanner = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SmartBankAccount smart = (SmartBankAccount)context.getBean("smartBankAccount");
        System.out.println("Welcome Mr/Ms:" + smart.getName());
        System.out.println("Your customer id is :" + smart.getCustomerId());
        System.out.println("Please select account type");
        System.out.println("1 CurrentAccount");
        System.out.println("2 RecurringAccount");
        System.out.println("3 FixedAccount");
		switch (scanner.nextInt()) {

		case 1:
			System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("Enter amount to be deposited");
				double deposit = scanner.nextDouble();
                System.out.println("Your balance amount is " + smart.doDeposit(deposit));
			} else if (choice == 2) {
				//Do call Withdraw
				System.out.println("Enter amount to be Withdrawn");
				double withdraw = scanner.nextDouble();
				System.out.println("Your balance amount is " + smart.doWithdraw(withdraw));

			} else {
				System.out.println("Wrong choice");
			}
			break;
		case 2:
			//Code for recurringAccount
			System.out.println("Enter monthly installment");
			double installment = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int month = scanner.nextInt();
			System.out.println("Your balance after " + month + " months will be " + smart.calculateRecurringAccount(installment, month));
			break;
		case 3:
			//Code for FD 
			System.out.println("Enter FD amount");
			double instalment = scanner.nextDouble();
			System.out.println("Enter tenure in months");
			int mon = scanner.nextInt();
			System.out.println("Your balance after " + mon + " months will be " + smart.calculateFixedAccount(instalment, mon));
			break;

		default:
			System.out.println("Wrong Choice");

		}

	}
}
