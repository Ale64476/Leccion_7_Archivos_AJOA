package Archivos;
import java.util.Scanner;
import java.io.*;

public class Controladora {
	
	public static void main(String[] args) {

		WebMaker generador = new WebMaker();

		try {
			PrintWriter escritor = new PrintWriter("index.html");
			Scanner	lector = new Scanner (new FileReader("form.txt"));
			escritor.println(generador.imprimirEncabezado());
		
			escritor.println(generador.imprimirTexto("Mi pagina web (soy el gato)"));
			escritor.println(generador.insertarImagen("Rainworld.png"));

			while(lector.hasNext())	{
				escritor.println(lector.nextLine());
			}
			escritor.println(generador.imprimirCierre());
			lector.close();
			escritor.close();
		
		}catch(FileNotFoundException e) {
			
		}
	}
}
