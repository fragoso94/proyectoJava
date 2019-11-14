package model;

import java.util.Date;

public class Magazine extends Publication{
	
	private int id;

	public Magazine(String title, Date editionDate, String[] authors, String editorial) {
		super(title, editionDate, authors, editorial);
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "::MAGAZINE::" +
				"\nTitulo: " + getTitle() +
				"\nFecha de edición: " + getEditionDate() +			
				"\n Editorial: " + getEditorial();
		
	}
	
}
