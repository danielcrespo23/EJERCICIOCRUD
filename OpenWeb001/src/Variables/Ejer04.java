package Variables;
/*Escribe un programa que lea dos números enteros por teclado
, y realice las operaciones básicas de una calculadora con ellos:
suma, resta, multiplicación, división y resto. Debe mostrar todos
los resultados por consola.
*/
import java.util.*;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Introduce el primer valor para realizar las operaciones: ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduce esta vez el segundo valor");
		num2 = sc.nextDouble();
		
		double suma = num1 + num2;
		double multiplicacion = num1 * num2;
		double division = num1 / num2;
		double resta = num1 - num2;
		
		System.out.println("SUMA ----> " + suma);
		System.out.println("RESTA ----> " + resta);
		System.out.println("MULTIPLICACIÓN ----> " + multiplicacion);
		System.out.println("DIVISION----> " + division);
	}

}
