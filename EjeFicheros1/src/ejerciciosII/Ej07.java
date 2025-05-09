package ejerciciosII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.err.println("Error. Faltan parametros <Fichero1> <Fichero2> <FicheroUnion>");
            return;
        }

        File f1 = new File(args[0]);
        File f2 = new File(args[1]);
        File f3 = new File(args[2]);

        if (!f1.canRead() || !f2.canRead()) {
            System.err.println("Error no se pueden leer los ficheros");
            return;
        }

        var sc1 = new Scanner(f1);
        var sc2 = new Scanner(f2);
        var ar = new ArrayList<String>();

        while (sc1.hasNextLine()) {
            ar.add(sc1.nextLine());
        }
        sc1.close();

        while (sc2.hasNextLine()) {
            ar.add(sc2.nextLine());
        }
        sc2.close();

        Collections.sort(ar);

        try (var pw = new PrintWriter(f3)) {
            for (String linea : ar) {
                pw.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error: al escribir");
        }
    
    }
}
