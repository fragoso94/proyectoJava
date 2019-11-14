package amazonviewer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import model.Movie;


public class Main {
	public static void main(String[] args) {
		Movie movie = new Movie("Coco", "Animation", (short)2017);
		//movie.title = "Abobinable"; //se puede alterar el valor de los atributos del objeto
		movie.setTitle("Rambo");
		movie.showData(); //llamando el metodo de Movie
		//showMenu();
	}
	
	public static void showMenu() {
		int exit = 0;
		int dato;		
		do {
			System.out.println("Hola Bienvenido a Amazon Viewer\n");
			System.err.println("");
			System.out.println("Selecciona el número de la opción deseada:");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Reports");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				dato = Integer.parseInt(reader.readLine());
				switch(dato) {
					case 1: 
						showMovies();
					break;
					case 2: 
						showSeries();
					break;
					case 3: 
						showBooks();
					break;
					case 4: 
						showMagazine();
					break;
					case 5: 
						makeReport();
					break;				
					case 6: 
						//Date date = new Date();
						makeReport(new Date());
					break;
					default: System.out.println("Opcion invalida");					
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}while(exit != 0);
	}
	
	public static void showMovies() {
		byte exit = 0;
		do {
			System.out.println();
			System.out.println("::MOVIES::");
			System.out.println();
		}while(exit != 0);
	}
	
	public static void showSeries() {
		byte exit = 0;
		do {
			System.out.println();
			System.out.println("::SERIES::");
			System.out.println();
		}while(exit != 0);
	}
	
	public static void showChapters() {
		byte exit = 0;
		do {
			System.out.println();
			System.out.println("::CHAPTERS::");
			System.out.println();
		}while(exit != 0);
	}
	
	public static void showBooks() {
		byte exit = 0;
		do {
			System.out.println();
			System.out.println("::BOOKS::");
			System.out.println();
		}while(exit != 0);
	}
	
	public static void showMagazine() {
		byte exit = 0;
		do {
			System.out.println();
			System.out.println("::MAGAZINE::");
			System.out.println();
		}while(exit != 0);
	}
	// sobre carga de métodos
	public static void makeReport() {
		
	}
	
	public static void makeReport(Date date) {
		
	}
	
}
