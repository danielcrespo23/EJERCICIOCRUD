import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class ContadorLineas {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Hay que indicar un directorio");
		}
		File f = new File(args[0]);
		
		if (!f.canRead() || !f.isDirectory()) {
			System.out.println("No es un directorio o no se puede leer");
			return;
		}
		int totalLineas = 0;
		//Obtengo la lista de archivos
		String ficheros[] = f.list();
		for (String fichero : ficheros) {
		    if (fichero.endsWith(".java")) {
		        File archivo = new File(f, fichero);  // Usa la ruta completa
		        int cont = contarLineasFichero(archivo);
		        System.out.println(fichero + ": " + cont);
		        totalLineas += cont;
		    }
		}
		System.out.println("TOTAL LINEAS" + totalLineas);
		
	}

	private static int contarLineasFichero(File fichero) {
	    int numLin = 0;
	    try (Scanner sc = new Scanner(fichero)) {
	        while (sc.hasNextLine()) {
	            sc.nextLine();
	            numLin++;
	        }
	    } catch (IOException e) {
	        System.out.println("ERROR DE LECTURA DE " + e);
	    }
	    return numLin;
	
		
	}
}
