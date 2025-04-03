Algoritmo CuadradoVaciio
	Definir tama Como Entero
	Escribir "Tamaño de la figura"
	leer tama
	CuadradoVacio(tama)
FinAlgoritmo

Funcion CuadradoVacio(tam)
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