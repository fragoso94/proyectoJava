package model;

public class Movie extends Film{
	
	private int id;
	private int timeViewed;
	
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year); //m�todo de la clase padre, par obtener el a�o
		
	}

	public void showData() {
		/*System.out.println("Titulo: " + title);
		System.out.println("Genero: " + genre);
		System.out.println("Year: " + year);*/
	}
	
	//m�todo getters and setters
	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		return 	"::MOVIE::" +
				"\nTitulo: " + getTitle() +
				"\nGenero: " + getGenre() +
				"\n A�o: " + getYear() +
				"\n Creador: " + getCreator() +
				"\n Duraci�n: " + getDuration();
		
	}
	
}
