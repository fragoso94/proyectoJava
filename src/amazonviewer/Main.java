package amazonviewer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		
		
		
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
			System.out.println("0. Exit");
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				dato = Integer.parseInt(reader.readLine());
				switch(dato) {
					case 1: System.out.println("Movies");
					break;
					case 2: System.out.println("Series");
					break;
					case 3: System.out.println("Books");
					break;
					case 4: System.out.println("Magazine");
					default: System.out.println("Numero invalido");					
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}while(exit != 0);
		
		
	}

}
