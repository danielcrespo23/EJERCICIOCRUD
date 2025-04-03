Algoritmo Ejercicio6Repaso
	Definir cantidad Como Entero
	Definir letra Como Caracter
	Escribir "¿Que conversión quiere realizar [E-Euros] o [D-Dolares]?"
	Leer letra
	Segun letra Hacer
		Caso 'E': 
			Escribir "Introduce la cantidad en dolares"
			leer cantidad
			Dolaraeuros = cantidad * 0.92
			Escribir cantidad " dolares son " Dolaraeuros " euros"
		Caso 'D':
			Escribir "Introduce la cantidad en euros"
			leer cantidad
			Eurosadolar = cantidad * 1.08
			Escribir cantidad " euros son " Eurosadolar " dolares"
	FinSegun
FinAlgoritmo
