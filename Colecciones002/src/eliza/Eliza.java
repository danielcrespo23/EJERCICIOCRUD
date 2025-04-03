package eliza;

import java.util.HashMap;
import java.util.Scanner;

public class Eliza {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
        // Respuestas predefinidas
        map.put("Hola", "Hola, ¿qué tal?");
        map.put("Encantado", "Encantado de conocerte yo también.");
        map.put("Adios", "Adiós, espero volverte a ver pronto.");
        map.put("Hora", "Lo siento, no llevo reloj.");
        map.put("Nombre", "Mi nombre es Eliza.");
        
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        do {
            // Leer una frase
            String frase = sc.nextLine().toLowerCase(); // Convertir la frase a minúsculas para comparar sin importar mayúsculas

            boolean encontrada = false;  // Variable para saber si encontramos la palabra

            // Recorrer todas las claves y ver si alguna está en la frase
            for (String clave : map.keySet()) {
                // Si la frase contiene la palabra clave, responde
                if (frase.contains(clave.toLowerCase())) {
                    System.out.println(map.get(clave)); // Mostrar la respuesta asociada
                    encontrada = true; // Ponemos true en el caso de que sí se encuentre
                    break; // Salir del bucle si encontramos la palabra clave
                }

                // Si el usuario dice "Adios", terminamos la conversación
                if (frase.equalsIgnoreCase("Adios")) {
                    System.out.println("¡Hasta luego!");
                    continuar = false;
                    break;
                }
            }

            // Si no se encontró ninguna palabra clave en la frase, mostramos el mensaje de error
            if (!encontrada && continuar) {
                System.out.println("Lo siento, no te comprendo.");
            }

        } while (continuar); // El bucle sigue ejecutándose mientras continuar sea true
    }
}
