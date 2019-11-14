package model;
import java.util.Date;

public class Book extends Publication{
	
	private int id;
	private boolean readed;
	private int timeReaded;

	public Book(String title, Date editionDate, String[] authors, String editorial) {
		super(title, editionDate, authors, editorial);
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
	
	@Override
	public String toString() {
		String detailBook =  "::BOOKS::" +
				"\nTitulo: " + getTitle() +
				"\nFecha de edición: " + getEditionDate() +
				"\n Editorial: " + getEditorial() + 
				"\n author: " + getAuthors();
		for(int i=0; i<getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
		
	}


}
