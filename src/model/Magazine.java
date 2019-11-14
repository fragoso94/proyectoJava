package model;

import java.util.Date;

public class Magazine extends Publication{
	
	private int id;

	public Magazine(String title, Date editionDate, String author, String editorial) {
		super(title, editionDate, author, editorial);
	}

	public int getId() {
		return id;
	}
	
}
