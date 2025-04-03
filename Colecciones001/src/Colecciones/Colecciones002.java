/*
  Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
todo el ArrayList sin usar ningún índice.
  
  */


package Colecciones;
import java.util.ArrayList;

public class Colecciones002 {
    public static void main(String[] args) {
    	
    	
        // Se crea el ArrayList y se agrega cada uno con ".add"
        ArrayList<String> alumnos = new ArrayList<>();
        	alumnos.add("Daniel");
        	alumnos.add("Álvaro");
        	alumnos.add("Sebas");
        	alumnos.add("Jorge");
        	alumnos.add("Ernesto");
        	alumnos.add("Mario");
        	
        // Recorrer el ArrayList sin usar índices
        for (String alumno : alumnos) { //Creamos un for each, creando alumno y que sea tipo String ya que los alumnos lo son
            System.out.print(alumno + " | ");
        }
    }
}



