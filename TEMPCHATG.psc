Algoritmo TemperaturasFebrero
    Definir temperaturaMax, temperaturaMin, temperaturas Como Entero
    Definir mediamensual, suma Como Real
    Definir diasBajoCero Como Entero
    temperaturaMax = -9999  // Valor inicial muy bajo para comparar
    temperaturaMin = 9999   // Valor inicial muy alto para comparar
    suma = 0
    diasBajoCero = 0
	
    Para contador = 1 Hasta 28 Con Paso 1
        Escribir "Introduce la temperatura que hizo el día ", contador, " de febrero"
        Leer temperaturas
        suma = suma + temperaturas  // Sumar correctamente las temperaturas
		
        // Comprobar si la temperatura es mayor que el máximo
        Si temperaturas > temperaturaMax Entonces
            temperaturaMax = temperaturas
        FinSi
		
        // Comprobar si la temperatura es menor que el mínimo
        Si temperaturas < temperaturaMin Entonces
            temperaturaMin = temperaturas
        FinSi
		
        // Contar los días con temperaturas menores de 0
        Si temperaturas < 0 Entonces
            diasBajoCero = diasBajoCero + 1
        FinSi
    FinPara
	
    // Calcular la media dividiendo la suma total entre 28 días
    mediamensual = suma / 28  
	
    Escribir "La temperatura máxima de febrero es de ", temperaturaMax, "º"
    Escribir "El día que menos grados hizo en febrero, hicieron ", temperaturaMin, "º"
    Escribir "La temperatura media mensual ha sido de ", mediamensual, "º"
    Escribir "Los días con temperaturas menores de 0º es de ", diasBajoCero
FinAlgoritmo
