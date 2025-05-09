import java.util.Arrays;

public class Metodos {

	public static void main(String[] args) {
		
		// TEST DE PRUEBA DE LA FUNCIONES
		
		// A)
		int datos1[] = {10,-2,4};
		System.out.println(operarTabla(datos1,'+')); // → Devuelve 12
		
		int datos2[] = {10,-2,5};
		System.out.println(operarTabla(datos2,'-')); //→ Devuelve 5
		
		int datos3[] = {5};
		System.out.println(operarTabla(datos3,'+'));  //→ Devuelve 5
		
		int datos4 [] = {};
		System.out.println( operarTabla(datos4,'-')); //→ Devuelve 0

        // B)
		 int matriz1 [][] = {{2,5,6},{6,6,5,1},{0,0}};
		 int matriz2 [][] = {{2,1,6,9},{5,6,1}};
		 int matriz3 [][] = {{2,5,6},{0,0,0},{5,9},{5,9,34,6}};
		System.out.println (hayfilaconCeros(matriz1));
		System.out.println (hayfilaconCeros(matriz2));
		System.out.println (hayfilaconCeros(matriz3));
		
		// C)
		String palabras1[] = {"if","case","for","if","case","switch"};
		String palabras2[] = {"java","python","java","php"};
		String palabras3[] = {"int","short","byte","long"};

		// D)		
		System.out.println(palabraRepetida(palabras1)); // → "if"
		System.out.println(palabraRepetida(palabras2)); //  → "java"
		System.out.println(palabraRepetida(palabras3)); // → null
		
		int valores [] = { 8, 5,2,0,3,5,2};
		System.out.println(Arrays.toString(sumaParImpar(valores)));
		
	}
	
	public static int operarTabla(int tabla[], char operador) {
		if (tabla.length == 0) {
			return 0;
		}
		int resu = tabla[0];
		for (int i = 1; i < tabla.length; i++) {
			if (operador == '+') {
			resu += tabla[i];
			} else {
				resu -= tabla[i];
			}
		}
		return resu;
	}

	public static boolean hayfilaconCeros(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
		boolean todosCeros = true;
		
		 for (int j = 0; j < matriz[i].length; j++) {
             if (matriz[i][j] != 0) {
                 todosCeros = false; 
             }
         }
		 if (todosCeros) {
             return true;
         }
     }
    
     return false;
 }
	

	public static String palabraRepetida(String palabras[]) {
	    for (int i = 0; i < palabras.length; i++) {
	        for (int j = i + 1; j < palabras.length; j++) { 
	            if (palabras[i].equals(palabras[j])) {
	                return palabras[i]; 
	            }
	        }
	    }
	    return null;
	}

	
	public static int[] sumaParImpar(int datos[]) {
	    int sumaPares = 0;
	    int sumaImpares = 0;

	    for (int i = 0; i < datos.length; i++) {
	        if (datos[i] % 2 == 0) {
	            sumaPares += datos[i];  
	        } else {
	            sumaImpares += datos[i]; 
	        }
	    }
	    return new int[] {sumaPares, sumaImpares};

	  
	}

	
	
}
