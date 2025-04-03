Algoritmo Operaciones
	// Entorno
	Definir Num1, Num2, Resultado Como Enteros
	Definir operacion Como Caracter
	Escribir "Introduce dos numeros enteros :"
	Leer Num1, Num2
	Escribir "Introduce operacion S-Suma, R-Resta y M-Multiplicacion"
	Leer operacion
	si (operacion == "S" o operacion =="s") Entonces
		Resultado = Num1 + Num2
	SiNo
	si (operacion == "R" o operacion =="r") Entonces
		Resultado = Num1 - Num2
	SiNo
	si (operacion == "M" o operacion =="m") Entonces
			Resultado = Num1 * Num2
			
		SiNo
			Escribir "Operación no valida"
		FinSi
	FinSi
	
	Escribir "El resultado es " resultado
FinAlgoritmo
