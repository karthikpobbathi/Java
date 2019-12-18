package com.cg.bean;

public abstract class MediaItem extends Item{
	
	public MediaItem() {
		// TODO Auto-generated constructor stub
	}

	public MediaItem(int idNo, String title, int copies) {
		super(idNo, title, copies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"MediaItem []";
	}
	
}
