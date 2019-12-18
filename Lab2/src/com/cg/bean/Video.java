package com.cg.bean;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	public Video() {
		
	}
	
	
	public Video(int idNo, String title, int copies,String director,String genre,int year) {
		super(idNo, title, copies);
		this.director=director;
		this.genre=genre;
		this.year=year;
		// TODO Auto-generated constructor stub
	}


	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Video [director=" + director + ", genre=" + genre + ", year=" + year + "]";
	}
	public void equals() {
		
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
		
	}
	

}
