package HashMap;

import java.util.HashMap;
import java.util.Scanner;


public class ControlAcceso {

	public static void main(String[] args) {
		HashMap <String, String> duser =  new HashMap<String, String>();
		
		duser.put("user01", "12345");
		duser.put("user02", "00000");
		duser.put("user03", "secreto");
		duser.put("admin", "admin");
		
		int contador = 0;
		int intentos = 2;
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.print("Usuario: ");
		
		String user = sc.next();
		
		System.out.print("Introduce la contraseña: ");
		
		String password = sc.next();
		
		String passwordInterna = duser.get(user);
		
		if (passwordInterna != null && passwordInterna.equals(password)) {
			System.out.println("HA ACCEDIDO A LA CUENTA");
			break;
		} else {
			System.out.println("Usuario o contraseña incorrectos");
			System.out.println("Nº de Intentos: " + intentos);
			contador++;
			intentos--;
		}
		} while(contador <= 2);
		System.out.println("Sesión bloqueada, 3  intentos fallidos");
	}

}
