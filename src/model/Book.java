package model;
import java.util.Date;

public class Book extends Publication{
	
	private int id;
	private boolean readed;
	private int timeReaded;
	
	
	public Book(String title, Date editionDate, String author, String editorial) {
		super(title, editionDate, author, editorial);
	}


	public int getId() {
		return id;
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
