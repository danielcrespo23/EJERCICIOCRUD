Algoritmo Eje35EDADEXACTA
	Definir a�o, mes, dia como entero
	Escribir "Introduzca el a�o [2000-2024]"
	leer a�o
	Mientras (a�o > 2024 o a�o < 2000)
		Escribir "A�o incorrecto "
		leer a�o
	FinMientras
	Escribir "Introduzca el mes [1-12]"
	leer mes
	Mientras (mes < 1 o mes > 12)
		Escribir "Mes incorrecto "
		leer mes
	FinMientras
	segun mes Hacer
		1,3,5,7,8,10,12: ultimodiadelmes = 31
		2: ultimodiadelmes = 28 // No considero bisiesto
			4,6,9,11: ultimodiadelmes = 30
	FinSegun
	Escribir "Introduzca el dia [1-",ultimodiadelmes,"]"
	leer dia
		Mientras (dia  < 1 o dia > ultimodiadelmes)
		Escribir "D�a incorrecto "
		leer d�a
	FinMientras
	Escribir "Fecha correcta ", dia,"/", mes,"/", a�o
FinAlgoritmo
