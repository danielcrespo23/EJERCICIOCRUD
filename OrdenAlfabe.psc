// Leer dos letras cualquiera y monstrarlo en orden alfabético
Algoritmo OrdenAlfabe
	Definir letra1, letra2 Como Caracter
	
	Escribir " Introduce la primera letra: "
	Leer letra1
	Escribir " Introduce la  segunda letra: "
	Leer letra2
	// Paso a mayusculas
	letra1 = mayusculas(letra1)
	letra2 = Mayusculas(letra2)
	Si (letra1 < letra2 ) Entonces
		Escribir letra1, "-", letra2
	SiNo
		Escribir letra2, "-", letra1
	FinSi
FinAlgoritmo
