package EstControl;

import java.util.Scanner;

/*
 * Escribe un programa en Java que acepte por teclado un número entero
 *  entre 1 y 10 
 * y muestre su tabla de multiplicar.
 */
public class Eje06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numMulti;
		
		System.out.println("Tabla de multiplicar del número: " );
		
		numMulti = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
		int resultado = numMulti * i;
		System.out.println(numMulti + " X " + i + " = " + resultado);
		}
		
		
	}

}
