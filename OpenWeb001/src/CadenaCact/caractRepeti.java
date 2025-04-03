package CadenaCact;

import java.util.Scanner;

/* 
 * Escribir un programa en Java que detecte el primer carácter repetido de una cadena de caracteres.
 */
public class caractRepeti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la cadena a verificar");
		String str = sc.nextLine();

		boolean repetido = false;
		char caracterRepetido = ' ';

		for (int i = 0; i < str.length() && !repetido; i++) { //RECORRE TODOS LOS CARAC
		    char c = str.charAt(i);
		    for (int j = i + 1; j < str.length(); j++) { // busca si ese carácter ya apareció anteriormente en la cadena.
		        if (c == str.charAt(j)) {
		            repetido = true;
		            caracterRepetido = c;
		            break;  // Salimos del bucle interior si encontramos el carácter repetido
		        }
		    }
		}

			if (repetido) {
				System.out.println("El caracter repetido es: " + caracterRepetido);
			} else {
				System.out.println("NO HAY CARACTER REPETIDO");
			}
    	
	        }
		
		
		}
		


