package EstControl;

import java.util.Scanner;

public class Locutorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float dineroBase = 0.5f;
        int minutos = 0;
        float coste = dineroBase;
        String diaSemana = null;
        
        System.out.println("¿Vas a realizar una llamada? (SI-NO)");
        String respuesta = sc.next();
        
        if (respuesta.equalsIgnoreCase("SI")) {  // Usa equals() para comparar cadenas
            System.out.println("¿Cuántos minutos duró la llamada?");
            minutos = sc.nextInt();  // Solicita la duración de la llamada
            
            // Cálculo del coste en función de los minutos
            if (minutos >= 1 && minutos <= 3) {
                coste += minutos * 0.75f;
            } else if (minutos >= 4 && minutos <= 7) {
                coste += minutos * 0.65f;
            } else if (minutos >= 8) {
                coste += minutos * 0.50f;
            }
            
            System.out.println("¿A qué hora se realizó tu llamada? (Introduce solo la hora en formato 24h)");
            int horas = sc.nextInt();
            
            // Recargo por llamada nocturna (22:00 - 7:59)
            if (horas >= 22 || horas < 8) {
                coste = coste * 1.05f;
            }
            
            System.out.println("¿Qué día de la semana es hoy?");
            diaSemana = sc.next();
            
            // Recargo por domingo
            if (diaSemana.equalsIgnoreCase("Domingo")) {
                coste = coste * 1.03f;
            }
            
            System.out.println("Coste final de la llamada: " + coste);
        }}

}
