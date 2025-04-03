/*
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.
 */

package Colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Colecciones003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        ArrayList<Integer> num = new ArrayList<Integer>(); // Creamos el Array
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            num.add(sc.nextInt()); // Captura números enteros del usuario por el SC y lo agrega al arrayList
        }
		
        
        Collections.sort(num); //Lo ordena todo
		System.out.println("LISTA DE VALORES");
		for (int valor : num) { //For each creado que recorre toda la tabla y muestra los valores ordenados por tamaño
			System.out.print(valor +  " ");
		
			}

		}
	}
