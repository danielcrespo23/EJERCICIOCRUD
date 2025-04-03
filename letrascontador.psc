Algoritmo letrascontador
	definir letras Como Caracter
	Definir contadorletras Como Entero
	Definir contadordeA Como Entero
	contadorletras = 0
	contadordeA = 0
	Repetir
		Escribir "Introduce una letra"
		leer letras
		si letras <> '.' Entonces
			contadorletras = contadorletras + 1
			si letras = 'a' Entonces
				contadordeA = contadordeA + 1
			FinSi
		FinSi
	Hasta Que letras = '.'
	Escribir "Se han introducido en total " contadorletras " letras"
	Escribir "La letra A se ha repetido " contadordeA
FinAlgoritmo
