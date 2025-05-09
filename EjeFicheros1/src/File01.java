import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File01 {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("No se ha indicado el fichero");
            return;
        }

        FileReader fr;
        try {
            fr = new FileReader(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el fichero");
            return;
        }

        int letra;
        System.out.println("Contenido del fichero: datos.txt");
        // Mientras no devuelva la lectura -1
        letra = fr.read();
        while (letra != -1) {
            char c = (char) letra;
            System.out.print(c);
            letra = fr.read();
        }

        // Cierra el fichero
        fr.close();
    }
}
