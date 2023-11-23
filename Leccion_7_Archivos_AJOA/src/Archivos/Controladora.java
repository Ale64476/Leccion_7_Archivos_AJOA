package Archivos;
import java.util.Scanner;
import java.io.*;

public class Controladora {
	
	public static void main(String[] args) {
		WebMaker generador = new WebMaker();
		PrintWriter escritor = new PrintWriter("index.txt");
		Scanner lector = new Scanner(new FileReader("form.txt"));
		
		escritor.println(generador.imprimirEncabezado());

	}

}
