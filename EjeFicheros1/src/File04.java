/*
 * Lee del fichero datos.txt y copia en resu.txt, carácter a carácter
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File04 {

	public static void main(String[] args) throws IOException {
		
		FileReader fe = new FileReader ("datos.txt");
		FileWriter fs = new FileWriter ("resu.txt");
		
		int letra;
		letra = fe.read();
		while (letra != -1) { // menos uno porque cuando llega al final muestra -1
			fs.write(letra);
			letra = fe.read();
			}
		fe.close();
		fs.close();
		System.out.println("Fichero copiado.");
	}

}
