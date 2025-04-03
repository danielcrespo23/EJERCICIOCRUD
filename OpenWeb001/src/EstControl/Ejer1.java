package EstControl;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce la nota de Daniel: ");
		
		int nota = sc.nextInt();
		
		String notaLiteral = switch (nota) { //Forma no sentencia
				case 10, 9 -> "Sobresaliente";
				case 8, 7 -> "Notable";
				case 6 -> "Bien";
				case 5 -> "Suficiente";
				case 4, 3, 2, 1, 0 -> "Insufiente";
		default -> "VALOR INCORRECTO";
		
		};
		
		System.out.println("LA NOTA LITERAL ES: " + notaLiteral);
	}

}
