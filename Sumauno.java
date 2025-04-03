/* Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Sumauno.java."

import java.io.*;

public class sumauno {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int valor;
		// Entorna
		// Proceso 
		System.out.println("Introduce un número entero:");
		valor = Integer.parseInt(bufEntrada.readLine());
		valor = valor+1;
		System.out.println("El resultado es : "+valor);
	}


}

