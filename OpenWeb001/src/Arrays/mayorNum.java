package Arrays;

public class mayorNum {
    public static void main(String[] args) {
        
        int[] miArray = {5, 10, 1234, 2, 8, 3};

        // Inicializamos max y segundoMax con el menor valor posible
        int max = Integer.MIN_VALUE;
        int segundoMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < miArray.length; i++) {
            if (miArray[i] > max) {
                segundoMax = max; // ✅ Guardamos el valor anterior de max en segundoMax
                max = miArray[i]; // ✅ Actualizamos max al nuevo valor más grande
            } else if (miArray[i] > segundoMax && miArray[i] < max) {
                segundoMax = miArray[i]; // ✅ Actualizamos segundoMax si encontramos un número menor que max pero mayor que segundoMax
            }
        }

        System.out.println("El mayor elemento del array es: " + max);
        System.out.println("El segundo mayor elemento del array es: " + segundoMax);
    }
}

