Algoritmo Ej1Combin
	Definir totalfactura como real
	Definir minutos Como Real
	Escribir "Introduzca los minutos"
	leer minutos
	Mientras (minutos <= 0)
		Escribir "Error, el valor debe ser mayor de 0"
		leer minutos
	FinMientras
	totalfactura = minutos * 0.10
	si (minutos > 1000 )
		totalfactura = totalfactura - totalfactura * 0.18
	FinSi
	Escribir "El importe de la factura es " totalfactura
FinAlgoritmo
