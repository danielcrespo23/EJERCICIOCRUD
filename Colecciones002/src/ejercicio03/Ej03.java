package ejercicio03;

import java.util.ArrayList;
import java.util.Random;

public class Ej03 {

    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> num = new ArrayList<Integer>();

        // Generamos un número aleatorio entre 10 y 20 para el tamaño de la lista
        int tamañoLista = rd.nextInt(11) + 10;  // Esto generará un número entre 10 y 20
        for (int i = 0; i < tamañoLista; i++) {
            int n = rd.nextInt(0, 101); // Genera valores del 0 al 100
            num.add(n); // Agrega el número a la lista
        }

        // Mostrar los valores introducidos
        System.out.println("VALORES INTRODUCIDOS:");
        for (int n : num) {
            System.out.print(n + " | ");
        }
        System.out.println(""); // Salto de línea

        // Realizamos la suma de los valores
        int suma = 0;
        for (int i = 0; i < num.size(); i++) {
            suma += num.get(i);
        }

        // Eliminar los números pares de la lista
        for (int i = 0; i < num.size(); i++) { //Recorremos la lista
            if (num.get(i) % 2 == 0) { // Si el número es par
                num.remove(i); // Elimina el número par
                i--; 
            }
        }

        // Mostrar los números impares restantes
        System.out.println("VALORES IMPARES RESTANTES:");
        for (int n : num) {
            System.out.print(n + " | ");
        }

        // Mostrar la suma total de los valores introducidos
        System.out.println("\nLa suma de los valores introducidos es: " + suma);
    }
}

