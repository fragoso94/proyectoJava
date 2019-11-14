package model;

public class Serie {
	private int id; 
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int sessionQuantity;;
	private short chapters;
	
	
	public Serie(String title, String genre, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
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


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getCreator() {
		return creator;
	}


	public void setCreator(String creator) {
		this.creator = creator;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public short getYear() {
		return year;
	}


	public void setYear(short year) {
		this.year = year;
	}


	public boolean isViewed() {
		return viewed;
	}


	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}


	public int getSessionQuantity() {
		return sessionQuantity;
	}


	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}


	public short getChapters() {
		return chapters;
	}


	public void setChapters(short chapters) {
		this.chapters = chapters;
	}
	
	
	
	

}
