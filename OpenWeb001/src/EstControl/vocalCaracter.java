package EstControl;

import java.util.Scanner;

/*9. Escribe un programa en Java que compruebe si un carácter es una vocal o no.

*/
public class vocalCaracter {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		
		char caract;
		System.out.println("Introduce un caracteres: ");
		
		caract = sc.next().charAt(0);
		
		if (caract == 'a' || caract == 'e' || caract == 'i' || caract == 'o' || caract == 'u' ) {
			   System.out.println("Es una vocal"); 
			} else {
				System.out.println("En una consonate");
		}
		
	}

}
