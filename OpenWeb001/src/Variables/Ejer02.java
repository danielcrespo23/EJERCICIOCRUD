package Variables;
/*Escribir un programa que, dada una cantidad de euros, nos indique 
 * cuál es su valor en dólares americanos. Además de la variable para 
 * la cantidad de euros, se debe declarar otra para el cambio (el valor
 *  de un dólar en euros) y para el resultado final. Muestra el resultado
 *   por consola.
 */

import java.util.Scanner;
public class Ejer02 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		double euros;
		float cantidad;
		
		System.out.println("Introduce la cantidad a transformar a euros : ");
		
		cantidad = sc.nextFloat();
		
		euros = cantidad / 1.08f;
		
		System.out.println("La cantidad en dolares es: " + cantidad);
		System.out.println("Dolares ---> Euros = " + euros);
	}

}
