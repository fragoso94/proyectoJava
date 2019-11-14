package model;

import java.util.Date;

public class Publication {
	
	private String title;
	private Date editionDate;
	private String author;
	private String editorial;
	
	public Publication(String title, Date editionDate, String author, String editorial) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.author = author;
		this.editorial = editorial;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getEditionDate() {
		return editionDate;
	}

	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	
}
