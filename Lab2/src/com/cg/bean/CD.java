package com.cg.bean;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD() {
		
	}
	public CD(int idNo,String title,int copies,String artist,String genre) {
		super(idNo,title,copies);
		this.artist=artist;
		this.genre=genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return super.toString()+"CD [artist=" + artist + ", genre=" + genre + "]";
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
		toString();
		
	}
	
	
}
