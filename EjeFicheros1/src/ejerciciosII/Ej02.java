/*
 *  Realizar un comando que muestre un fichero de texto con sus líneas invertidas.
	Si el fichero contiene:
		Hola
		Pepe 
	Debe mostrar:
		aloH
		epeP
 */

package ejerciciosII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej02 {

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
        	
        	String invertida = ""; // Hacemos un nuevo string para poder ponerlo luego y siemor que este vacio

            for (int i = linea.length() - 1; i >= 0; i--) { //Recorremos cada linea empezando desde el final y como es inversa ponemos --
                invertida += linea.charAt(i);
            }
            System.out.println(nl + " -> " + invertida);
            nl++;
        }
    }


}
