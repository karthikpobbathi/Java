package com.cg.bean;

public abstract class WrittenItem extends Item {
	private String authorName;
	private int age;
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}
	public WrittenItem(int idNo,String title,int copies,String authorName,int age) {
		super(idNo,title,copies);
		this.authorName=authorName;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "WrittenItem [authorName=" + authorName + ", age=" + age + "]";
	}
	

}
