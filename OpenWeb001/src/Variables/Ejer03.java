package Variables;

import java.util.Scanner;

//Escribe un programa que determine si un número es par o impar
//usando el operador ternario.


public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int numero;
		System.out.println("Introduce un número (Es par o impar)");
		
		numero  = sc.nextInt();
		
		String parImpar = (numero % 2 == 0) ? "Par" : "Impar";
		System.out.println(parImpar);
		
	}

}
