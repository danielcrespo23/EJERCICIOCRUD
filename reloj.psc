Algoritmo reloj
	Definir horas, minutos, segunndos como entero
	Escribir "Horas [0..23] "
	Leer horas
	mientras (horas < 0 o horas > 23 )
		Escribir "Valor erroneo"
		leer horas
	FinMientras
	
	Escribir "Minutos [0..59]"
	leer minutos
	mientras (minutos < 0 o minutos > 59 )
		Escribir "Valor erroneo"
		leer minutos
	FinMientras
	
	Escribir "Segundos [0..59] "
	leer segunndos
	Mientras (segunndos < 0 o segunndos > 59 )
		Escribir "Valor erroneo"
		leer segunndos
	FinMientras
	
	Escribir "Son las " horas ":" minutos ":" segunndos
	Esperar 1 Segundo
	segunndos = segunndos + 1
	si (segunndos >= 60) Entonces
		segunndos = 00
		minutos = minutos + 1
	FinSi
	Si (minutos >= 60) Entonces
		minutos = 00
		horas = horas + 1
	FinSi
	Escribir "Son las " horas ":" minutos ":" segunndos
FinAlgoritmo
