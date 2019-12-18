package com.cg.banking.test;

import static org.junit.Assert.*;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.banking.beans.CustomerBean;
import com.cg.banking.service.CustomerService;
import com.cg.banking.util.HashMapUtil;

public class CustomerServiceTest {
	CustomerService customerService=null;
	HashMapUtil hashMapUtil=null;
	CustomerBean customer=null;	CustomerBean customer1=null;
	CustomerService cs=new CustomerService();

	@Before
	public void setUp() throws Exception {
		customer =new CustomerBean(1000.0,"karthik","9999999999","1234567","Chennai");
		customer1 =new CustomerBean(2000.0,"rehman","9999999989","1234568","hyderabad");
		hashMapUtil = new HashMapUtil();
		customerService = new CustomerService();
		customerService.addCustomerDetails(customer);
		customerService.addCustomerDetails(customer1);
	}

	@After
	public void tearDown() throws Exception {
		customer=null;
		hashMapUtil=null;
		customerService=null;
	}


	@Test
	public void withDrawtest() {
		customerService.WithDraw("1234567", 500.0);
		assertEquals(500.0,customer.getBalance(),1);
	}
	@Test
	public void depositTest(){
		customerService.deposit("1234567", 500.0);
		assertEquals(1500,customer.getBalance() ,1);
	}

	@Test
	public void testFundTransfer(){
		customerService.fundTransfer("1234567","1234568", 500.0);
		assertEquals(500.0,customer.getBalance() ,1);
		assertEquals(2500.0,customer1.getBalance(),1);
	}
	
	@Test
	public void viewBalanceTest(){
		customerService.viewBalance("1234567");
		assertEquals(1000.0,customer.getBalance(),1);
	}
	
	@Test
	public void addCustomerDetailsTest(){
		assertNotNull(customer);
	}
	
	@Test
	public void printTransactionTest(){
		customerService.transactionDetails("1234567");
		customerService.deposit("1234567", 500.0);
		assertNotNull(customer.getTransaction());
	}

}
