//  Incrementa en uno cuando el valor es par
//Decrementa uno si el valor es impar
// El valor cero no es correcto
Proceso Sumauno
	// Entorna
	Definir valor Como Entero
	//Proceso 
	Escribir "Introduce un número entero:"
	leer valor
	si (valor == 0 ) Entonces
		Escribir " El valor cero no es válido "
	SiNo
	si (valor % 2 == 0 ) Entonces
		valor = valor + 1
	SiNo
		valor = valor - 1
	FinSi
	Escribir "El resultado es : " valor
FinSi

FinProceso
