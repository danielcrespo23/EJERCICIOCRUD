package HashMap;
//✅ Ejercicio 1: Ordenar un HashMap por CLAVES usando TreeMap

import java.util.*; // Importamos las utilidades necesarias (HashMap, TreeMap, etc.)

public class OrdenHashMap {
	
    public static void main(String[] args) {
        // Creamos un HashMap con claves Integer y valores String
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(3, "Manzana"); // Insertamos elementos , el primer vaor siempre son las claves y luego los valores
        mapa.put(1, "Pera");
        mapa.put(2, "Banana");

        // Mostramos el HashMap original (sin orden)
        System.out.println("HashMap original (sin orden):");
        for (Map.Entry<Integer, String> e : mapa.entrySet()) {
            System.out.println("Clave: " + e.getKey() + ", Valor: " + e.getValue());
        }

        // Creamos un TreeMap pasando el HashMap para que ordene por clave
        TreeMap<Integer, String> mapaOrdenado = new TreeMap<>(mapa);

        // Mostramos el contenido ordenado por claves
        System.out.println("\nOrdenado por CLAVES con TreeMap:");
        for (Map.Entry<Integer, String> e : mapaOrdenado.entrySet()) {
            System.out.println("Clave: " + e.getKey() + ", Valor: " + e.getValue());
        }
    }
}

