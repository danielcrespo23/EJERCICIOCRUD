package EstControl;

import java.util.Scanner;

/*
 * 11. Escribe un programa en Java que encuentre cuál es el mayor de 3 números usando sentencias if-else.

 */
public class mayor3 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		
		int num1;
		int num2;
		int num3;
		int mayor;
		System.out.println("Introduce tres números diferentes: ");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		//int mayor = Math.max(num1, Math.max(num2, num3)); Funcion mas rapida para saber el mayor de los tres
		
		if (num1 > num2 && num1 > num3) {
			 mayor = num1;
		} else if (num2 > num1 && num2 > num3) {
			mayor = num2;
		} else {
			mayor = num3;
		}
		
		System.out.println("El número mayor es: " + mayor);
	}

}
