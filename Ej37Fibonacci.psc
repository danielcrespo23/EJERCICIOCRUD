Algoritmo Ej37
	Definir fibonacci Como Entero
	Definir f1, f2 Como Entero
	Escribir "El numero de la seria de Fibonacci"
	leer num
	f1 = 1
	f2 = 1
	si (num = 1 o num = 2)
		fibonacci = 1
	SiNo
		para i=3 hasta num Hacer
			fibonacci = f1 + f2
			f1 = f2
			f2 = fibonacci
		FinPara
	FinSi
	Escribir "Fibonacci de F(",num,") = ", fibonacci
FinAlgoritmo
