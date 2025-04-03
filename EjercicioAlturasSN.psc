Algoritmo Ejerciciosrepaso5
	Definir altura Como Entero
	Definir letra Como Caracter
	Escribir "Introzca altura: "
	leer altura
	Escribir "¿Desea introducir más datos (S/N)?"
	Leer letra
	Mientras letra = 'S' Hacer
		Escribir "Introduzca altura:"
		leer altura
		Escribir "¿Desea introducir más datos (S/N)?"
		Leer letra
	FinMientras
	si (altura < 160) Entonces
		contador160 = contador160 + 1
	FinSi
	si (altura > 160) y (altura < 170) Entonces
		contador160170= contador160170 + 1
	FinSi
	si (altura > 170) y (altura < 180) Entonces
		contador170180 = contador170180
	SiNo
		si (altura > 180) Entonces
			contador180 = contador180 + 1
		FinSi
	FinSi
	Escribir "Resumen de estatura [<160]: " contador160 
	Escribir "Resumen de estatura [160-170cm]: " contador160170 
	Escribir "Resumen de estatura [170 - 180 cm]: " contador170180 
	Escribir "Resumen de estatura [>180]: " contador180 

FinAlgoritmo
