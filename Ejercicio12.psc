//Realiza formas de distintos tipos
Algoritmo Ejercicio12
	Definir tamaño, tipo Como Entero
	Escribir "Tipo de dibujo [1-5]"
	leer tipo
	Escribir " Tamaño "
	leer tamaño
	
	Segun tipo Hacer
		1: 
			escalera(tamaño)
		2:
			Cuadradorelleno(tamaño)
		3:
			Cuadradovacio(tamaño)
		4: 
			Rombo(tamaño)
		5:
			Cuadradoplus(tamaño)
		De Otro Modo:
			Escribir "El nº de la figura no es correcta"
	FinSegun
FinAlgoritmo

Funcion escalera ( tam )
	para f=1 Hasta tam Hacer
		Para c=1 hasta i Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinFuncion

Funcion Cuadradorelleno (tam)
	para f=1 Hasta tam Hacer
		Para c=1 hasta tam Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir "*"
	FinPara
	
FinFuncion

Funcion Cuadradovacio (tam)
	para f=1 Hasta tam Hacer
		Para c=1 hasta tam Hacer
			si (f = 1 o  f=tam o c=1 o c=tam)
				Escribir "*" Sin Saltar
			Sino
				Escribir " " Sin Saltar
			FinSi
		FinPara
		Escribir ""
	FinPara
FinFuncion

Funcion Rombo (tam)
	para f=1 Hasta tam Hacer
		Para c=1 hasta i Hacer
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinFuncion

Funcion Cuadradoplus (tam)
	
	FinPara
	
FinFuncion