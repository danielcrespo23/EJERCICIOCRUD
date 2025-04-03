package Variables;
import java.util.Scanner;

/*
 * Escribir un programa que calcule el perímetro y el área de un círculo y 
 * la muestre por consola. El `radio` del mismo lo puedes 
 * proporcionar como un valor inicial de la variable correspondiente.
 */

public class Ej01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Introduce el radio del circulo: ");
		
		int radio = sc.nextInt();
		int perimetro = radio * 2;
		double area = 3.14 * (radio * radio);
		
		System.out.println("Radio del circulo : "  + radio );
		System.out.println("El perimetro es: " + perimetro);
		System.out.println("El area de dicho circulo es " + area);
		
	}

}
