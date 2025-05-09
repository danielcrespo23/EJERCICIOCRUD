package ejerciciosII;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ej09 {

    static String[] java = { "{", "}", "while", "for", "class", "return" };
    static String[] pseudo = { "INICIO", "FIN", "MIENTRAS", "PARA", "CLASE", "DEVUELVE" };

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Error. Falta parámetro <FicheroJava>");
            return;
        }

        try {
            Scanner sc = new Scanner(new File(args[0]));
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                traducir(linea);
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e);
        }
    }

    public static void traducir(String linea) {
        String lineaTraducida = linea;
        for (int i = 0; i < java.length; i++) {
            lineaTraducida = lineaTraducida.replace(java[i], pseudo[i]);
        }
        System.out.println(lineaTraducida);
    }
}
