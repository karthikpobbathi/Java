package com.cg.banking.pi;

import java.util.InputMismatchException;
import java.util.Scanner;


import com.cg.banking.beans.CustomerBean;
import com.cg.banking.exception.ConsumerException;
import com.cg.banking.service.CustomerService;
import com.cg.banking.service.ICustomerService;


public class CustomerMain {

	static CustomerBean c1=null;
	static Scanner sc=new Scanner (System.in);
	static ICustomerService customerService =null;

	public static void main(String[] args) {
		int option=0;
		String  accountNumber;
		double with;
		double draw;
		while (true) {

			// show menu
			System.out.println();
			System.out.println("         Welcome to CG Bank      ");
			System.out.println("_______________________________\n");

			System.out.println("1.Add Bank Details ");
			
			
			System.out.println("2.View Balance");
			System.out.println("3.Withdraw");
			System.out.println("4.Deposit");
			System.out.println("5.fund Transfer");
			System.out.println("6.Print Transaction");
			System.out.println("7.Exit");
			System.out.println("________________________________");
			System.out.println("Select an option:");
			// accept option
			option = sc.nextInt();

			switch (option) {

			case 1:

				while (c1 == null) {
					c1 = populateCustomerBean();
					// System.out.println(CustomerBean);
				}
				
				
				try {
					customerService = new CustomerService();
					customerService.addCustomerDetails(c1);

					System.out.println("account  has been successfully registered ");
					System.out.println("account number: " + c1.getaccountNumber());

				} catch (ConsumerException cException) {
					
					System.err.println("ERROR : "+ cException.getMessage());
				} finally {
					customerService = null;
					c1=null;
				}


				break;


			/*case 2:

				customerService = new CustomerService();

				System.out.println("Enter account number:");
				accountNumber = sc.next();

				customerService.viewCustomerDetails(accountNumber);

				break;*/

			case 2:
				customerService = new CustomerService();
				System.out.println("Enter account number:");
				accountNumber = sc.next();
				customerService.viewBalance(accountNumber);

				break;

			case 3:

				customerService = new CustomerService();
				System.out.println("Enter account number:");
				accountNumber = sc.next();
				System.out.println("Enter amount to withdraw");
				with=sc.nextDouble();
				customerService.WithDraw(accountNumber,with);break;

			case 4:

				customerService = new CustomerService();
				System.out.println("Enter account number:");
				accountNumber = sc.next();
				System.out.println("Enter amount to deposit");
				draw=sc.nextDouble();
				customerService.deposit(accountNumber,draw);
				break;

			case 5:

				customerService = new CustomerService();
				System.out.println("Enter sender account number:");
				accountNumber = sc.next();
				System.out.println("Enter receiver account number:");
				String accountNumber1 = sc.next();
				System.out.println("Enter amount to transfer");
				draw=sc.nextDouble();
				customerService.fundTransfer(accountNumber,accountNumber1,draw);
				break;
				
			case 6:
				customerService = new CustomerService();
				System.out.println("Enter account number:");
				accountNumber = sc.next();
				customerService.transactionDetails(accountNumber);
				break;
				
			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("enter only 1-8 digits");

			}}}






	private static CustomerBean populateCustomerBean() 
	{

		// Reading and setting the values for the CustomerBean

		CustomerBean customerBean = new CustomerBean();

		System.out.println("\n Enter Details");

		System.out.println("Enter Customer name: ");
		customerBean.setcustomerName(sc.next());

		System.out.println("Enter Account Number: ");
		customerBean.setaccountNumber(sc.next());

		
		

		System.out.println("Enter phone number: ");
		customerBean.setPhoneNumber(sc.next());
		
		System.out.println("Enter Location: ");
		customerBean.setLocation(sc.next());
		System.out.println("Enter Balance: ");
		try {
			customerBean.setBalance(sc.nextDouble());
		} catch (InputMismatchException inputMismatchException) {
			sc.nextLine();
			System.err.println("Please enter a numeric value for donation amount, try again");
			}
		

		customerService = new CustomerService();

		try{
			customerService.validateConsumer(customerBean);
			return customerBean;
		}
		
		
		catch (ConsumerException donorException) {
			
			
			System.err.println(donorException.getMessage() + " \n Try again..");
			//System.exit(0);

		}
		return null; 
	}
}

