/*
 * Realizar un programa que muestre las N primeras líneas de un fichero de texto.
 */

package ejerciciosII;

import java.io.File;
import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Faltan parametros: <numero> <Fichero>");
			return;
		}
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
		} catch (NumberFormatException e) {
			System.err.println("Debe introducir un numero entero correcto");
			return;
		}
		
		File f = new File(args[1]);
		
		if( !f.canRead() ) {
			System.err.println("No se puede leer el fichero " + args[1]);
			return;
		}
		
		try (Scanner fc = new Scanner(f)){
			int contador = 0;
			while(fc.hasNextLine() && contador < num) {
			String linea = fc.nextLine();
			contador++;
			System.out.println(linea);
			}
		} catch (Exception e) {
			System.out.println("Error al procesar el fichero");
		}
		
	}

}
