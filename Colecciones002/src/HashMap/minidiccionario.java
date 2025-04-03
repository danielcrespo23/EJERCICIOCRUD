package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class minidiccionario {

	public static void main(String[] args) {
		HashMap <String, String> palabras =  new HashMap<String, String>();
		
		palabras.put("Manzana", "Apple");
		palabras.put("Oso", "Bear");
		palabras.put("Azul", "Blue");
		palabras.put("Cafe", "Coffe");
		palabras.put("Mar", "Sea");
		palabras.put("Raton", "Mouse");
		palabras.put("Profesor", "Teacher");
		palabras.put("Agua", "Water");
		palabras.put("Perro", "Dog");
		palabras.put("Silla", "Chair");
		
		ArrayList<String> palabrasEspañol = new ArrayList<>(palabras.keySet());
        Collections.shuffle(palabrasEspañol); //Coleecion que se usa para barajear y cogerlas de forma aleatoria

        int correctas = 0;
        int incorrectas = 0;

        // Escoge 5 palabras aleatorias y hace las preguntas
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String palabraEspañol = palabrasEspañol.get(i); // Obtenemos una palabra aleatoria
            String traduccionCorrecta = palabras.get(palabraEspañol); // Obtenemos la traducción correcta

            System.out.print("Traducción de: " + palabraEspañol + "? ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                incorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}