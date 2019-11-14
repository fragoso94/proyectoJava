package model;
import java.util.Date;

public class Book {
	private int id;
	private String title;
	private short bookPages;
	private Date editionDate;
	private String author;
	private String editorial;
	private boolean readed;
	private int timeReaded;
	
	
	public Book(String title, Date editionDate, String author, String editorial) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.author = author;
		this.editorial = editorial;
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


	public short getBookPages() {
		return bookPages;
	}


	public void setBookPages(short bookPages) {
		this.bookPages = bookPages;
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


	public boolean isReaded() {
		return readed;
	}


	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	

}
