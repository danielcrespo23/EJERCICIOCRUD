/*
 * Muestra el contenido de un fichero de texto cuyo nombre es introducido por el usuario, leyendo línea a línea.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File03 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indique le nombre de un fichero:");
		 String nombre = sc.nextLine();
		
		File f = new File(nombre);
		
		 if (!f.canRead()) {
	            System.out.println("El fichero " + nombre +
	                " no existe o no tiene permisos de lectura");
	            return;
	        }

		Scanner sc1 = new Scanner(f);
		
		int nl = 1;
        while (sc1.hasNextLine()) {  
        	String linea = sc1.nextLine();
            System.out.println(nl + " -> " + linea);
            nl++;
        }
    }
}



