package Archivos;
import java.util.Scanner;
import java.io.*;

public class Controladora {
	
	public static void main(String[] args) {
		
		WebMaker generador = new WebMaker();
		
		try {
		PrintWriter escritor = new PrintWriter("index.txt");
		Scanner lector = new Scanner(new FileReader("form.txt"));
		
		escritor.println(generador.imprimirEncabezado());
		escritor.println(generador.imprimirTexto("Un texto de prueba :D"));
		escritor.println(generador.imprimirTexto("Pagina web para expresar mi odio hacia las tareas"));
		
		
		while(lector.hasNext())	{
			escritor.println(lector.nextLine());
		}
		escritor.println(generador.imprimirCierre());
		lector.close();
		escritor.close();
		}catch(FileNotFoundException e){
		}
	}

}
