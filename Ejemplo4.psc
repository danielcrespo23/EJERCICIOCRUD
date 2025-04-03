Algoritmo Ejemplo4
	Definir max Como Entero
	Definir mini Como Entero
	Definir numeross Como Entero
	Escribir " Introduce 10 numeros enteros "
	Leer numeross
	max = numeross
	mini = numeross
	para contador = 1 hasta 10 Hacer
		leer numeross
		si (numeross > max)
			max = numeross
		FinSi
		si (numeross < mini)
			mini = numeross
		FinSi
		FinPara
		Escribir "El numero maximo es " max
		Escribir "El numero mas pequeño es " mini
FinAlgoritmo
