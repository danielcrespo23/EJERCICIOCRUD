/*
 * Lee del fichero datos.txt y copia en resu.txt, carácter a carácter
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File05 {

	public static void main(String[] args) throws IOException {
		File file = new File("datos.txt");
		Scanner sc = new Scanner(file);
		PrintWriter pw = new PrintWriter ("resu2.txt");
		
		String linea;
		
		while (sc.hasNextLine()) {
			linea = sc.nextLine();
			pw.println(linea);
			}
		sc.close();
		pw.close();
		System.out.println("Fichero copiado.");
	}


	}


