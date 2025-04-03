/*
 Realiza un programa equivalente al anterior pero en esta ocasión, el programa
debe ordenar palabras en lugar de números.
 */

package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Colecciones004 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
        ArrayList<String> num = new ArrayList<String>(); // Creamos el Array pero esta vez de STRING
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: ");
            num.add(sc.next()); // Captura esta vez las cadenas de texto "String" del usuario por el SC y lo agrega al arrayList
        }
		
        
        Collections.sort(num); //Lo ordena todo, ademas debemos importar la libreria
		System.out.println("LISTA DE VALORES");
		for (String valor : num) { //For each creado que recorre toda la tabla y muestra los valores ordenados por tamaño, ESTA VEZ POR ORDEN ALFABETICO
			System.out.print(valor +  " ");
		
			}

		}
	}
