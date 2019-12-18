package com.cg.bean;

public abstract class Item {
	private int idNo;
	private String title;
	private int copies;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int idNo, String title, int copies) {
		super();
		this.idNo = idNo;
		this.title = title;
		this.copies = copies;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Item [idNo=" + idNo + ", title=" + title + ", copies=" + copies + "]";
	}
	public abstract void checkIn();
	public abstract void checkOut();
	public abstract void addItem();
	public abstract void printDetails();

}
