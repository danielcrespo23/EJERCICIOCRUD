/*
 * Realizar un programa que cuente el número de líneas, caracteres y palabras que tiene un fichero pasado como parámetro.
$java ContarPLC fichero.txt
Caracteres = 234, Líneas = 16, Palabras = 45
 */

package ejerciciosII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) throws FileNotFoundException {
		if (args.length != 1) {
            System.err.println("Error. Faltan parametros <Fichero1> <Fichero2> <FicheroUnion>");
            return;
        }
		int contcar = 0;
		int contln = 0;
		int contpala = 0;
		boolean error = false;
		
      try {
    	  Scanner sc = new Scanner(new File(args[0]));
    		  
    	  while (sc.hasNextLine()) {
    		  String linea = sc.nextLine();
    		  contln++;
    		  contcar += linea.length();
    		  //Separa palabra entre uno o varios espacios
    		  String palabra[] = linea.split("\\s");
			contpala += palabra.length;
    		  
    	  }
      } catch (Exception e) {
    	  System.out.println("Error de lectura " + e);
    	  error = true;
      }
      System.out.println("Caracteres " + contcar);
      System.out.println("Palabras " + contpala);
      System.out.println("Lineas " + contln);
	}
}
