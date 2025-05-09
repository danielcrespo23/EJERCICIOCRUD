package ejerciciosII;
/*
 * Realizar un comando en java para visualizar ficheros de texto que me permita mostrar el fichero pantalla a pantalla (24 líneas consecutivas), 
 * realizando una espera después de cada pantalla hasta que el usuario pulse Intro, para mostrar la siguiente página del fichero. 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej01 {
	

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique el nombre de un fichero: ");
        String nombre = sc.nextLine();

        File f = new File(nombre);

        if (!f.canRead()) {
            System.out.println("El fichero " + nombre + " no existe o no tiene permisos de lectura");
            return;
        }

        Scanner lector = new Scanner(f);
        int contadorLineas = 0;
        int numeroLinea = 1;

        while (lector.hasNextLine()) {
            System.out.println(numeroLinea + " -> " + lector.nextLine());
            numeroLinea++;
            contadorLineas++;

            if (contadorLineas == 1) {
                System.out.print("-- Pulsa INTRO para continuar --");
                sc.nextLine(); // Espera a que el usuario pulse Intro
                contadorLineas = 0;
            }
        }

        lector.close();
        System.out.println("-- Fin del fichero --");
    }
}

