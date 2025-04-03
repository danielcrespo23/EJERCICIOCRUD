package EstControl;

import java.util.Scanner;

/* 
 * Escribe un programa en Java que comprueba si un año es bisiesto o no.Recuerda que 
 * los años bisiestos son aquellos que son divisibles entre 4 pero que no son divisibles entre 100, o que son divisibles entre 400.
 */
public class añosBisiestos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int año;
		
		System.out.println("Comprobación de año bisiesto: ");
		
		año = sc.nextInt();
		
		if (año % 4 == 0 || año % 100 == 0 || año % 400 == 0 ) {
			System.out.println( año + "-----> Es bisiesto");
		} else {
			System.out.println( año + "----->No es bisiesto");

		}
	}

}
