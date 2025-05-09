package ejerciciosII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer datos del usuario por consola
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el nombre del fichero de origen (el que se quiere copiar)
        System.out.print("Indique el nombre de un fichero que quiera copiar: ");
        String nombreOrigen = sc.nextLine();

        // Creamos un objeto File con el nombre proporcionado
        File ficheroOrigen = new File(nombreOrigen);

        // Verificamos si el fichero existe y se puede leer
        if (!ficheroOrigen.exists() || !ficheroOrigen.canRead()) {
            // Si no existe o no se puede leer, mostramos mensaje de error y salimos del programa
            System.out.println("El fichero " + nombreOrigen + " no existe o no tiene permisos de lectura");
            return;
        }

        // Pedimos al usuario el nombre del fichero de destino (donde se copiará el contenido)
        System.out.print("Indique el nombre del fichero donde copiar el contenido de " + nombreOrigen + ": ");
        String nombreDestino = sc.nextLine();

        // Creamos un objeto File para el fichero de destino
        File ficheroDestino = new File(nombreDestino);

        // Utilizamos try-with-resources para abrir los flujos de lectura y escritura
        try (
            // Creamos un Scanner para leer línea a línea el fichero origen
            Scanner lector = new Scanner(ficheroOrigen);
            // Creamos un PrintWriter para escribir en el fichero destino
            PrintWriter escritor = new PrintWriter(ficheroDestino);
        ) {
            int numeroLinea = 1; // Contador para mostrar el número de línea por consola

            // Mientras haya líneas por leer en el fichero origen
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();      // Leemos una línea
                escritor.println(linea);              // La escribimos en el fichero destino
                System.out.println(numeroLinea + " -> " + linea); // También la mostramos por consola
                numeroLinea++;                         // Aumentamos el contador de línea
            }

            // Al finalizar, mostramos mensaje de éxito
            System.out.println("Copia realizada correctamente.");

        } catch (FileNotFoundException e) {
            // Si ocurre un error al abrir los ficheros, lo mostramos
            System.out.println("Error al acceder a uno de los ficheros: " + e);
        }
    }
}
