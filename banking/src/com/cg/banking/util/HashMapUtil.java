package com.cg.banking.util;

import java.util.HashMap;

import com.cg.banking.beans.CustomerBean;



public class HashMapUtil {

	CustomerBean CustomerBeanObj;

	static HashMap<String, CustomerBean> hm = new HashMap<String , CustomerBean>();


	public void addCustomer(CustomerBean CustomerBeanObj) 
	{	
		//System.out.println(CustomerBeanObj.getaccountNumber());
		this.CustomerBeanObj = CustomerBeanObj;						
		hm.put(CustomerBeanObj.getaccountNumber(), CustomerBeanObj);	

	}


	public HashMap<String , CustomerBean> hm()
	{				
		return hm;
	}
}
