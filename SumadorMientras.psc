PROCESO SumadorMientras
	//Suma una serie de número enteros hasta leer el número cero */
	Definir Num, Contador, Suma, Media como Enteros
	Contador <- 0
	Suma <- 0
	Leer Num
	MIENTRAS ( Num <> 0 )
		Suma = Suma + Num
		Contador = Contador + 1
		Leer Num
	FINMIENTRAS
	Media = Suma / Contador
	Escribir " La suma es = ", Suma
	Escribir " La media es = ", Media
FinProceso
