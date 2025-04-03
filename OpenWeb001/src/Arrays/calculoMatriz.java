package Arrays;
import java.util.Scanner;

public class calculoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el tamaño del array: ");
		
		int tamañoMatriz = sc.nextInt();
		
		int[][] matriz = new int[tamañoMatriz][tamañoMatriz];
		
		 // Ingresar los valores de la matriz
        System.out.println("Ingresa los valores de la matriz:");
        for (int i = 0; i < tamañoMatriz; i++) { // Recorre las filas
            for (int j = 0; j < tamañoMatriz; j++) { // Recorre las columnas
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt(); // Guarda el número ingresado en la matriz
            }
        }
        
     // Mostrar la matriz ingresada
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < tamañoMatriz; i++) {
            for (int j = 0; j < tamañoMatriz; j++) {
                System.out.print(matriz[i][j] + " "); //Los muestra y luegp deja espacio entre ellos para una mejor muestra
            }
            System.out.println(); // Salto de línea después de cada fila
        }
		
		int suma = calculoValores(matriz);
		
		
		System.out.println("La suma de todos los elementos de la matriz es: " + suma);
    }

	
	public static int calculoValores(int[] [] matriz) {
		int suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}}
