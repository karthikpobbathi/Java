package com.cg.banking.beans;


public class CustomerBean {
	private double balance;
	private String customerName;
	private String phoneNumber;
	private String accountNumber;
	private String location;
	private String transaction;
	
	public CustomerBean(){} 
	
	public CustomerBean(double balance, String customerName, String phoneNumber, String accountNumber, String location) {
		super();
		this.balance = balance;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.accountNumber = accountNumber;
		this.location = location;
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}


	

	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		//for junit transaction is initialised null
		this.transaction =this.transaction+"\n"+ transaction;
	
		
	}
	public double  getBalance() {
		return balance;
	}
	public void setBalance(double  balance) {
		this.balance = balance;
	}
	public String getcustomerName() {
		return customerName;
	}
	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String  getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String  phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String  getaccountNumber() {
		return accountNumber;
	}
	public void setaccountNumber(String  accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Printing customer Details \n");
		sb.append("customer Name: " +customerName +"\n");
		sb.append("customer accountNumber: "+ accountNumber +"\n");
		sb.append("Location "+ location +"\n");
		sb.append("Balance: "+ balance +"\n");
		sb.append("Phone Number: "+ phoneNumber +"\n");
		
		
		return sb.toString();
	}
	

	
}


