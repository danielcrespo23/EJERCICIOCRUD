Algoritmo Operaciones
	// Entorno
	Definir Num1, Num2, Resultado Como Enteros
	Definir operacion Como Caracter
	Escribir "Introduce dos numeros enteros :"
	Leer Num1, Num2
	Escribir "Introduce operacion S-Suma, R-Resta y M-Multiplicacion"
	Leer operacion
	
	segun operacion
		"S", "s": Resultado = Num1 + Num2
		"R", "r" : Resultado = Num1 - Num2
		"M", "m": Resultado = Num1 * Num2
		De Otro Modo:
		escribir "Operacion no valida"
	FinSegun
	Escribir "El resultado es " resultado
FinAlgoritmo
