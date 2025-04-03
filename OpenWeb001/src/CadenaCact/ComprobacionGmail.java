package CadenaCact;

import java.util.Scanner;

/*
 * Escribir un programa en Java que verifique si una cadena de caracteres es una dirección de email. Para ello debe comprobar, en este orden:
	- Que tiene algo de texto o números
	- Que tiene un carácter @
	- Que tiene algo de texto o números
	- Que tiene un punto
	- Que termina con algo de texto.
 */
public class ComprobacionGmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la dirección de correo electronico: ");
		
		String correoElectronico = sc.next();
		
		 if (esEmailValido(correoElectronico)) {
	            System.out.println("El email es válido.");
	        } else {
	            System.out.println("El email NO es válido.");
	        }

	        sc.close();
	    }

	    public static boolean esEmailValido(String email) {
	        // Verificar si contiene '@' y '.'
	        int arroba = email.indexOf('@');
	        int punto = email.lastIndexOf('.');

	        // Debe tener '@' y '.' en orden correcto
	        if (arroba > 0 && punto > arroba + 1 && punto < email.length() - 1) {
	            return true;
	        }
	        return false;
	    }
}
