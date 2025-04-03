package CadenaCact;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Escribir un programa en Java que acepte dos cadenas de caracteres y verifique
 *  si son anagramas, es decir, que tienen los mismos caracteres pero en otro orden.
 */
public class Anagramas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la primera palabra: ");
		
		String str1 = sc.next();
		
		System.out.println("Introduce la segunda palabra: ");
		
		String str2 = sc.next();
		
		 if (areAnagrams(str1, str2)) {
	            System.out.println("Las cadenas son anagramas.");
	        } else {
	            System.out.println("Las cadenas NO son anagramas.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        //convertir a minúsculas
	        str1 = str1.toLowerCase();
	        str2 = str2.toLowerCase();

	        // Convertir las cadenas a arrays de caracteres
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        // Ordenar los arrays de caracteres
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Comparar los arrays de caracteres ordenados
	        return Arrays.equals(charArray1, charArray2);
	    }
	}