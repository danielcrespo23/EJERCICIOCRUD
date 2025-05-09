import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileOrdenar {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("orden.txt");
        Scanner sc = new Scanner(file);
        PrintWriter pw = new PrintWriter("datosord.txt");

        ArrayList<String> lineas = new ArrayList<>();

        while (sc.hasNextLine()) {
            lineas.add(sc.nextLine());
        }

        Collections.sort(lineas);

        for (String linea : lineas) {
            pw.println(linea);
        }

        sc.close();
        pw.close();
		System.out.println("Fichero copiado y ordenado.");

    }
}
