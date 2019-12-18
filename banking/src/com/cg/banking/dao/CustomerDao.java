package com.cg.banking.dao;



import java.util.HashMap;

import com.cg.banking.beans.CustomerBean;

public interface CustomerDao {
	public void addCustomerDetails(CustomerBean Customer) ;
	public HashMap<String , CustomerBean> viewCustomerDetails() ;
}
