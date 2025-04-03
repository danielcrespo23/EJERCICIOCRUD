package CadenaCact;
/*
	 * 5. Escribir un programa en Java que tome una cadena escrita por el usuario y la escriba en mayúsculas y al revés.
	 */

	//toLowerCase() → Convierte una cadena a minúsculas.
	//toUpperCase() → Convierte una cadena a mayúsculas.
import java.util.Scanner;

public class mayusMinus {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una palabra: ");
		
		String palabra = sc.next();
		
		String mayusculas = palabra.toUpperCase();
		
		String invertida = "";
		
		for (int i = mayusculas.length() - 1; i >= 0; i--) {
			invertida += mayusculas.charAt(i);
		}
		System.out.println("Palabra invertida y en mayusculas: " + invertida);
	}

}
