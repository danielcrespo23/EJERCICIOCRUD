
/*
 * FileDemo – Lee un nombre de un fichero y muestra si existe su nombre, ruta donde se almacena,
 *  tamaño y fecha de última modificación. 
 * Si el fichero es un directorio se muestra los nombres de los ficheros que contiene 
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;

public class FileDemo {

	
		public static void main ( String argv[] ) throws IOException
		 {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Indique le nombre de un fichero o directorio:");
		 String nombre = sc.nextLine();

		 File fichero = new File( nombre );
		 if ( fichero.exists() ) {
		 System.out.println("Nombre: "+fichero.getName());
		 System.out.println("- Ruta completa: "+ fichero.getAbsolutePath() );
		 System.out.println("- Tamaño: "+ fichero.length() + " bytes");
		 System.out.println("- Última modificación: "
		 + new Date(fichero.lastModified()) );
		 if (fichero.isFile()) {
		 System.out.println("- Fichero normal");
		 } else if (fichero.isDirectory()) {
		 System.out.println("- Directorio");
		 String ficheros[] = fichero.list();
		 for (int i=0; i<ficheros.length; i++) {
		 System.out.println("\t"+ficheros[i]);
		 }
		 }

		 } else {
		 System.out.println("El fichero '"+nombre+"' no existe");
		 }

		
		 
}

}