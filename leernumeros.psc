Algoritmo leeernumeros
	Definir numers Como Entero
	Definir contadornumeros Como Entero
	contadornumeros = 0
	Repetir
		Escribir "Introduce un numero"
		Leer numers
		si (numers <> 0) Entonces
			contadornumeros = contadornumeros + 1
		FinSi
	Hasta Que (numers = 0)
	Escribir "El total de números introducidos es de " contadornumeros
FinAlgoritmo
