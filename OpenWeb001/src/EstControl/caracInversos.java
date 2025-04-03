package EstControl;
/*
 * Escribe un programa que acepte por teclado una cadena y
 *  muestre la cadena inversa.
 */

import java.util.Scanner;

public class caracInversos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		System.out.println("Introduce una cadena de caracteres");
		cadena = sc.next();
		
		String cadenaInvertida = "";
		
		// Recorre la cadena desde el último carácter hasta el primero.
		for (int i = cadena.length() - 1; i >= 0; i--) { 
		    // Concatena cada carácter en orden inverso a la nueva cadena.
		    cadenaInvertida += cadena.charAt(i); 
	}
        System.out.println("Cadena invertida: " + cadenaInvertida);

	}
}
