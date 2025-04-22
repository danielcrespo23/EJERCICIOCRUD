package ArrayList;

import java.util.*; // Importamos utilidades necesarias

public class OrdenarArrayList {
    public static void main(String[] args) {
        // Creamos una lista de enteros
        List<Integer> numeros = new ArrayList<>();
        Random rand = new Random(); // Objeto para generar números aleatorios

        // Llenamos la lista con 10 números aleatorios entre 0 y 99
        for (int i = 0; i < 10; i++) {
            numeros.add(rand.nextInt(100));
        }

        // Mostramos la lista original (desordenada)
        System.out.println("Lista original:");
        System.out.println(numeros);

        // Ordenamos la lista en orden ascendente
        Collections.sort(numeros);

        // Mostramos la lista ordenada
        System.out.println("Lista ordenada:");
        System.out.println(numeros);
    }
}
