package model;

public class Movie extends Film{
	
	private int id;
	private int timeViewed;
	
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year); //método de la clase padre, par obtener el año
		
	}

	public void showData() {
		/*System.out.println("Titulo: " + title);
		System.out.println("Genero: " + genre);
		System.out.println("Year: " + year);*/
	}
	
	//método getters and setters
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
				"\n Año: " + getYear() +
				"\n Creador: " + getCreator() +
				"\n Duración: " + getDuration();
		
	}
	
}
