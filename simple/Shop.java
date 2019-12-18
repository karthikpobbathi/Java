package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Shop {
private Map<Integer,String> productMap;
	
	public Map<Integer, String> getProductMap() {
		
		
		return productMap;
	}

	public void setProductMap(Map<Integer, String> productMap) {
	    
		this.productMap = productMap;
	}

	//This method should add the serialNumber as key and productName value into the productMap map
	public void addProductDetails(int serialNumber,String productName)
	{
		productMap.put(serialNumber,productName);
	}
	
	/*
	 * This method should search the product based on the producttype and add those products
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 * 1	Fair And Lovely Cream
		2	Lakme Lotion
		3	Fair One Lotion
		4	Ponds Cream
		5	Baby Cream
		if the product type is lotion the output should be
		Lakme Lotion
		Fair One Lotion

	 */
	public List<String> searchBasedOnproduct(String productType){
		List<String> array= new ArrayList<>();
		int a;boolean b;
		for(int i =1;i<=5;i++)
		{
			if(productMap.containsKey(i)){
		a= productMap.get(i).indexOf(productType);
			if(a!=-1){
				array.add(productMap.get(i));
			}}}
		return array;
		
}}
