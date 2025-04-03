Algoritmo Eje35EDADEXACTA
	Definir año, mes, dia como entero
	Escribir "Introduzca el año [2000-2024]"
	leer año
	Mientras (año > 2024 o año < 2000)
		Escribir "Año incorrecto "
		leer año
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
		Escribir "Día incorrecto "
		leer día
	FinMientras
	Escribir "Fecha correcta ", dia,"/", mes,"/", año
FinAlgoritmo
