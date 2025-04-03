Algoritmo RomboAsteriscos
	Definir tam Como Entero
	Definir espacios, asteriscos Como Entero
	
	Escribir "Tamaño del rombo"
	leer tam
	espacios = tam
	asteriscos = 1
	//Parte de arriba
	para i = 1 hasta tam
		para j = 1 hasta espacios
			Escribir " " Sin Saltar
		FinPara
		para j= 1 hasta asteriscos
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
		espacios = espacios - 1
		asteriscos = asteriscos + 2
	FinPara
	// Centro
	para j=1 hasta asteriscos
		Escribir "*" Sin Saltar
	FinPara
	Escribir ""
	//Parte de abajo
	espacios = 1
	asteriscos = asteriscos - 2
	para i = 1 hasta tam
		para j = 1 hasta espacios
			Escribir " " Sin Saltar
		FinPara
		para j= 1 hasta asteriscos
			Escribir "*" Sin Saltar
		FinPara
		Escribir ""
		espacios = espacios + 1
		asteriscos = asteriscos - 2
	FinPara
	
FinAlgoritmo
