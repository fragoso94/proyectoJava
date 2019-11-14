package model;

public class Serie extends Film {
	
	private int id; 
	private int sessionQuantity; //cantidad de temporadas
	private Chapter[] chapters; //colección de capitulos
	
		
	public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
	}


	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}


	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}


	public Chapter[] getChapter() {
		return chapters;
	}


	public void setChapter(Chapter[] chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		return "::Serie::" +
				"\nTitulo: " + getTitle() +
				"\nGenero: " + getGenre() +
				"\n Creador: " + getCreator() +
				"\n Duración: " + getDuration() +
				"\n Cantidad de temporadas: " + getSessionQuantity();
		
	}

	
}
