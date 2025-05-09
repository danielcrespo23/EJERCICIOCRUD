// Lee de un fichero pasado como parámetro en la línea de comandos
// y muestra los números de líneas y el número de caracteres

import java.io.*;
import java.util.*;

public class File02 {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("No se ha indicado el fichero");
            return;
        }

        File f = new File(args[0]);

        if (!f.canRead()) {
            System.out.println("El fichero " + args[0] +
                " no existe o no tiene permisos de lectura");
            return;
        }

        Scanner sc = new Scanner(f);
        int nl = 1;
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            System.out.println(nl + " -> " + linea);
            nl++;
        }
    }
}

