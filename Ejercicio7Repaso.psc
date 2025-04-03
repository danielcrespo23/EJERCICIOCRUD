Algoritmo Ejercicio7Repaso
	Definir segundos Como Entero
	Definir hh, mm, ss Como Entero
	Escribir "Dime la hora en segundos totales"
	leer segundos
	hh = segundos / 3600
	mm = segundos / 60
	ss = segundos / 60
	si hh > 23 Entonces
		Escribir "Valor Erroneo, introduce menos segundos"
	FinSi
	si ss >= 60 Entonces
		ss = 00
		mm = mm + 1
	FinSi
	si mm >= 60 Entonces
		mm = 00
		hh = h + 1
	FinSi
	Escribir "Si hay ", segundos, " totales, serían las ", hh, ":", mm, ":", ss, " si empezara a contar desde las 00:00. "
FinAlgoritmo
