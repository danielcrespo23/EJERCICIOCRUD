package EstControl;

import java.util.Scanner;

public class piramideAsteriscos {
/*
 * 12. Escribe un programa en Java que pinte una pirámide con asteriscos. El número de pisos debe introducido a través del teclado.

 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int tamañoPiramide;
		
		System.out.println("Introduce el tamaño de la piramide: ");
		
		tamañoPiramide = sc.nextInt();
		
		 // Bucle para generar cada fila de la pirámide
        for (int i = 1; i <= tamañoPiramide; i++) {
            // Imprimir espacios en blanco para alinear los asteriscos
            for (int j = 0; j < tamañoPiramide - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los asteriscos de la fila actual
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Salto de línea para pasar a la siguiente fila
            System.out.println();
        }
        
        
    }
}
        
