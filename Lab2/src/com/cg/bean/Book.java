package com.cg.bean;

public class Book extends WrittenItem {  
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int idNo, String title, int copies, String authorName, int age) {
		super(idNo, title, copies, authorName, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nBook[]";
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		super.toString();
	}
	

}
