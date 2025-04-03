package Arrays;

import java.util.Scanner;

/*
 * Crea un programa en Java que calcule la suma de todos los elementos de una matriz de enteros de tamaño 3x3.
 */
public class suma3x3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		int[][] matriz = { //En primer lugar definimos los valores
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 6 }
	        };
		
		int suma = calculoValores(matriz);
		
		
		System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }

	
	public static int calculoValores(int[] [] matriz) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}}
