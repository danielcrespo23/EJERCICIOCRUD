package Colecciones;


/*Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.
*/

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
public class Colecciones001 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int tamaño = rd.nextInt(10, 21);

		ArrayList<Integer> ar =  new ArrayList<Integer>();
		
		//Relleno el array
		for (int i = 0; i < tamaño; i++) {
			int num = rd.nextInt(0, 10);
			ar.add(num); // Lo arrega a la tabla de Integer de AR
		}
		
		// Calcular max, min, media y total
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int suma  = 0;
		int media = 0;
		
		for (int i = 0; i<tamaño; i++) {
			int valor = ar.get(i);
			suma += ar.get(i);
			media = suma / ar.size(); //Libreria de ArrayList para ver el tamaño de la tabla
			if (valor > max) {
				max = valor;
				
			} else if (valor < min) {
				min = valor;
			}
		}
		
		System.out.println("La suma de los valores es " + suma);
		System.out.println("La media de los valores es " + media);
		System.out.println("El valor mas alto es " + max);
		System.out.println("El valor mas pequeño es " + min);
	

		Collections.sort(ar); //Coleccion utilizada para ordenar la tabla que hemos creado
		System.out.println();
		System.out.println("LISTA DE VALORES");
		for (int valor : ar) { //For each creado que recorre toda la tabla y muestra los valores ordenados por tamaño
			System.out.print(valor +  " ");
		}
		
	}

}
