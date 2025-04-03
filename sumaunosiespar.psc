//  Incrementa en uno cuando el valor es par
Proceso Sumauno
	// Entorna
	Definir valor Como Entero
	//Proceso 
	Escribir "Introduce un número entero:"
	leer valor
	si (valor % 2 == 0 ) Entonces
		valor = valor + 1
	FinSi
	Escribir "El resultado es : " valor
FinProceso
