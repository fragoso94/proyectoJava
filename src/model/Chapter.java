package model;

public class Chapter extends Movie{

	private int id;
	private int sessionNumber; //temporadas
	

	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public int getId() {
		return this.id;
	}
	
	public int getSessionNumber() {
		return sessionNumber;
	}


	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		return "::Chapter::" +
				"\nTitulo: " + getTitle() +
				"\nGenero: " + getGenre() +
				"\n Creador: " + getCreator() +
				"\n Duración: " + getDuration() +
				"\n Año: " + getYear() +
				"\n Cantidad de temporadas: " + getSessionNumber();
		
	}

	
}
