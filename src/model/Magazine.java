package model;

import java.util.Date;

public class Magazine {
	private int id;
	private String title;
	private Date editionDate;
	private String authors;
	private String editorial;
	
	
	public Magazine(String title, Date editionDate, String authors) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.authors = authors;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getAuthors() {
		return authors;
	}


	public void setAuthors(String authors) {
		this.authors = authors;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	
}
