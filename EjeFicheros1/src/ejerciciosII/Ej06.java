package ejerciciosII;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.err.println("Faltan parametros: <numero> <Fichero>");
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
		var  ar = new ArrayList<String>();
		try (Scanner fc = new Scanner(f)){
			int contador = 0;
			while(fc.hasNextLine() && contador < num) {
			String linea = fc.nextLine();
			ar.add(linea);
			}
		} catch (Exception e) {
			System.out.println("Error al procesar el fichero");
		}
		int numlinea = ar.size() - num ;
		
		if (numlinea < 0) {
			numlinea = 0;
		}
		
		for (int i = numlinea; i < ar.size(); i++) {
			System.out.println( (i +1) + " :" + ar.get(i));
		}
	}

}