import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File00 {

	public static void main ( String argv[] ) throws IOException {
		FileReader fr;
		try {
			fr = new FileReader("datos.txt");
		} catch (FileNotFoundException e){
			System.out.println("");
			return;
		}
		 int letrai;
		 System.out.println("Contenido del fichero: datos.txt:");
		 // Mientras no devuelva la lectura -1
		 letrai = fr.read();
		 while (letrai != -1) {
		 char letra = (char) letrai;
		 System.out.print(letra);
		 letrai = fr.read();
		 }
		 // Cierra el fichero
		 fr.close();


}
}
