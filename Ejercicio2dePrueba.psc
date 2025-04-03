Algoritmo Ejercicio2dePrueba
	Definir numeross, sumatotal Como Entero
	Definir mediaImpa, mediapares Como Real
	Escribir "	Escribe el valor 0 para terminar"
	leer numeross
	sumatotal = 0
		Mientras (numeross <> 0 ) Hacer
			si (numeross % 2 == 0) Entonces
				contadorPares = contadorPares + 1
				sumapares = sumapares + numeross
			SiNo
				ContadorImpares = ContadorImpares + 1
				sumaimpares = sumaimpares + numeross
			Finsi
				leer numeross
			FinMientras
			si contadorPares > 0 Entonces
				mediapares = sumapares/contadorPares
			FinSi
			si ContadorImpares > 0 Entonces
				mediaImpa = sumaimpares/ContadorImpares
			FinSi
			si (mediapares > mediaImpa) Entonces
				Escribir "La media de los pares es mayor"
			SiNo
				Escribir "La media de los impares es mayor"
			FinSi	
			contadortotal = contadorPares + ContadorImpares
			sumatotal = sumatotal + numeross
			Escribir "El valor total de numeros introducidos es de " contadortotal
			Escribir "La media de los numeros pares es de " mediapares
			Escribir "La media de los numeros impares es de " mediaImpa
			Escribir "El numero total de numeros escritos es  " sumatotal
FinAlgoritmo
