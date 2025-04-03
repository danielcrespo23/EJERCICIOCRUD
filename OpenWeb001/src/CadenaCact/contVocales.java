package CadenaCact;
/*
 * Escribir un programa que cuente el número de vocales de una cadena de caracteres.
 */
import java.util.Scanner;

public class contVocales {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce una palabra: ");
        String vocales = sc.next(); // 
        
        String minusculas = vocales.toLowerCase();
        int contVocales = 0;
        
        for (int i = 0; i < minusculas.length(); i++) { // Recorre la cadena entera
            char c = minusculas.charAt(i);
            /*
             * minusculas.charAt(i) obtiene el carácter en la posición i de la cadena.
             * Se almacena en la variable c, que es de tipo char.
             * Esto permite que en cada iteración del bucle, c contenga un carácter distinto de la palabra.
             */
             
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { 
                contVocales++;
            }
        }
        
        if (contVocales > 0) { 
            System.out.println("En la palabra introducida hay en total " + contVocales + " vocales");
        } else {
            System.out.println("En la palabra introducida no hay vocales");
        }
    }
}

