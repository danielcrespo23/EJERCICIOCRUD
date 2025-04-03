Algoritmo Ejeercicio5Para
	// Si es un ciclo y por ejemplo dice el final se hara con el repetitivo Para 
	//(Cuando tiene un numero indicado de ciclos)
	//El mientras o el repetir se haria cuando sea un ciclo repetitivo 
	//que no ponga cuantas veces hay que realizarlo
	Definir numeross, posi, negati, nulo Como Entero
	posi = 0
	negati= 0
	nulo = 0
	Para contador <- 1 Hasta 10
		Escribir "Introduce un número"
		leer numeross
		si (numeross > 0) Entonces
			posi = posi + 1
		sino 
			si (numeross < 0) Entonces
				negati = negati + 1
			SiNo
				nulo = nulo + 1
			FinSi
		FinSi
	FinPara
	Escribir "Hay un total de " posi " números positivos"
	Escribir "Hay un total de " negati " números  negativos"
	Escribir "Hay un total de " nulo " números nulos"
	
FinAlgoritmo
