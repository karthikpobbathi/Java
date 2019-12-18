package com.cg.bean;

public class Journal extends WrittenItem {
	private int yearOfPublished;
	public Journal() {
		// TODO Auto-generated constructor stub
	}
	public Journal(int idNo,String title,int copies,String name,int age,int yearOfPublished) {
		super(idNo,title,copies,name,age);
		this.yearOfPublished=yearOfPublished;
	}

	public int getYearOfPublished() {
		return yearOfPublished;
	}
	public void setYearOfPublished(int yearOfPublished) {
		this.yearOfPublished = yearOfPublished;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"\nJournal [yearOfPublished=" + yearOfPublished + "]";
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
		this.toString();
	}
	
}
