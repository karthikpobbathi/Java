package com.cg.banking.service;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.cg.banking.beans.CustomerBean;
import com.cg.banking.dao.CustomerDao;
import com.cg.banking.dao.CustomerDaoImp;
import com.cg.banking.exception.ConsumerException;
import com.cg.banking.util.HashMapUtil;

public class CustomerService implements ICustomerService {

	CustomerDao d=null;

	//HashMapUtil hashmapobj=new HashMapUtil();


	@Override
	public  void addCustomerDetails(CustomerBean Customer)throws ConsumerException {
		d=new CustomerDaoImp();
		d.addCustomerDetails(Customer);



	}





	@Override
	public void viewBalance (String  accountno) {

		d=new CustomerDaoImp();

		if (d.viewCustomerDetails().isEmpty())
		{
			System.out.println("Please create an account first.");
		} 

		else {

			if (d.viewCustomerDetails().containsKey(accountno)) {
				System.out.println(
						"Your Account Balance is: " +d.viewCustomerDetails().get(accountno).getBalance());
			}

			else {
				System.out.println("No such Account Exist.");
			}
		}

	}

	@Override
	public void WithDraw(String  accountno,double withdrawAmount){

		d=new CustomerDaoImp();

		if (d.viewCustomerDetails().isEmpty()){
			
		} 
		else {

			if (d.viewCustomerDetails().containsKey(accountno)) {

				d.viewCustomerDetails().get(accountno).
				setBalance(d.viewCustomerDetails().get(accountno).getBalance()-withdrawAmount);

				System.out.println(
						"Your Account Balance is: " +d.viewCustomerDetails().get(accountno).getBalance());

				d.viewCustomerDetails().get(accountno).setTransaction("debited  "+ withdrawAmount);
				}
			else{
				
			}

		}
	}

	@Override
	public void deposit(String  accountno,double depositAmount){

		d=new CustomerDaoImp();

		if (d.viewCustomerDetails().isEmpty()){
			
		} 
		else {

			if (d.viewCustomerDetails().containsKey(accountno)) {

				d.viewCustomerDetails().get(accountno).
				setBalance(d.viewCustomerDetails().get(accountno).getBalance()+depositAmount);

				System.out.println(
						"Your Account Balance is: " +d.viewCustomerDetails().get(accountno).getBalance());

				d.viewCustomerDetails().get(accountno).setTransaction("credited  "+ depositAmount);
				}

		}


	}

	@Override
	public void fundTransfer(String  senderaccountno,String  receiveaccountno,double transferAmount){

		d=new CustomerDaoImp();

		if (d.viewCustomerDetails().isEmpty()){
			System.out.println("Please create an accounts first.");
		} 

		else {
			
			if (d.viewCustomerDetails().containsKey(senderaccountno)&&d.viewCustomerDetails().containsKey(receiveaccountno)) {
			
				if(d.viewCustomerDetails().get(senderaccountno).getBalance()>=transferAmount){
					d.viewCustomerDetails().get(receiveaccountno).setBalance(d.viewCustomerDetails().
							get(receiveaccountno).getBalance()+transferAmount);

					d.viewCustomerDetails().get(senderaccountno).setBalance(d.viewCustomerDetails().
							get(senderaccountno).getBalance()-transferAmount);

					System.out.println(
							"Your amount has been transfered to account number"+d.viewCustomerDetails().
							get(receiveaccountno).getBalance());

					d.viewCustomerDetails().get(receiveaccountno).
					setTransaction("credited  "+ transferAmount);

					d.viewCustomerDetails().get(senderaccountno).
					setTransaction("debited  "+ transferAmount);
				
				
			}else{
				System.out.println("no sufficient balance");
			}}

			else{
				System.out.println("given account numbers are not present");
			}

		}
	}
	@Override
	public void transactionDetails (String  accountNumber)
	{
		d=new CustomerDaoImp();
		System.out.println(d.viewCustomerDetails().
				get(accountNumber).getTransaction());
	}





	public void validateConsumer(CustomerBean bean) throws ConsumerException
	{
		List<String> validationErrors = new ArrayList<String>();

		//Validating Customer name
		if(!(isValidName(bean.getcustomerName()))) {
			validationErrors.add("\n Customer Name Should Be In Alphabets and minimum 3 characters long ! \n");
		}
		//Validating address
		if(!(isValidAddress(bean.getLocation()))){
			validationErrors.add("\n Address Should Be Greater Than 5 Characters \n");
		}
		//Validating Phone Number
		if(!(isValidPhoneNumber(bean.getPhoneNumber()))){
			validationErrors.add("\n Phone Number Should be in 10 digit \n");
		}
		if(!(validateCustomerAccountnumber(bean.getaccountNumber()))) {
			validationErrors.add("\n Customer Account number Should Be In minimum of 6 digtits \n");
		}
		//Validating Donation Amount
		if(!(isValidAmount(bean.getBalance()))){
			validationErrors.add("\n Amount Should be a positive Number \n" );
		}

		if(!validationErrors.isEmpty())
			throw new ConsumerException(validationErrors +"");
	}

	public boolean isValidName(String CustomerName){
		Pattern namePattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(CustomerName);
		return nameMatcher.matches();
	}
	public boolean isValidAddress(String address){
		return (address.length() >= 6);
	}

	public boolean isValidPhoneNumber(String phoneNumber){
		Pattern phonePattern=Pattern.compile("^[6-9]{1}[0-9]{9}$");
		Matcher phoneMatcher=phonePattern.matcher(phoneNumber);
		return phoneMatcher.matches();

	}
	public boolean isValidAmount(double amount){
		return (amount>0);
	}
	public boolean validateCustomerAccountnumber(String CustomerAccountNumber) {

		Pattern idPattern = Pattern.compile("[0-9]{6,10}");
		Matcher idMatcher = idPattern.matcher(CustomerAccountNumber);

		if(idMatcher.matches())
			return true;
		else
			return false;		
	}

}





