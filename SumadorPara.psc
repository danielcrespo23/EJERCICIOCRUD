PROCESO SumadorPara
	// Suma una serie de n�mero determinados 
	Definir  N, Num, Contador, Suma como Enteros
	Definir Media Como Real
	Suma <- 0
	Escribir  "Cuantos n�mero va a introducir :"
	Leer N
	PARA Contador <- 1 HASTA N HACER
		Leer Num
		Suma <- Suma + Num
	FINPARA
	Media <-  Suma / N
	Escribir  " La suma es  = ", Suma
	Escribir  " La media es = ", Media
	FINProceso