package com.cg.banking.service;



import com.cg.banking.beans.CustomerBean;
import com.cg.banking.exception.ConsumerException;



public interface ICustomerService {
	public  void addCustomerDetails(CustomerBean Customer)throws ConsumerException ;
	
	public void viewBalance(String  CustomerId) ;
	public void WithDraw(String  accountno,double withdrawAmount);
	public void deposit(String  accountno,double depositAmount);
	public void transactionDetails (String  accountNumber);
	public void fundTransfer(String  senderaccountno,String receiveaccountno,double transferAmount);
	public void validateConsumer(CustomerBean bean) throws ConsumerException;}
