package EstControl;

import java.util.Scanner;

import java.util.Scanner;

public class primoNoprimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        // Caso especial para el 1, que no es primo
        if (num <= 1) {
            System.out.println("NO ES PRIMO");
        } else {
            boolean esPrimo = true;

            // Verificamos si el número tiene divisores menores que él (excepto 1 y el mismo número)
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número introducido es primo");
            } else {
                System.out.println("NO ES PRIMO");
            }
        }

        sc.close();
    }
}
