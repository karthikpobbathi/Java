package com.cg.banking.dao;

import java.util.HashMap;

import com.cg.banking.beans.CustomerBean;
import com.cg.banking.util.HashMapUtil;

public class CustomerDaoImp implements CustomerDao {
	HashMapUtil hashmapobj=new HashMapUtil();
	
	
	@Override
	public void addCustomerDetails(CustomerBean Customer) {
		// TODO Auto-generated method stub

		hashmapobj.addCustomer(Customer);

	}

	@Override
	public HashMap<String , CustomerBean> viewCustomerDetails() {
		// TODO Auto-generated method stub


		return hashmapobj.hm(); }


}
