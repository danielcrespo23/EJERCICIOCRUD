Algoritmo TemperaturasFebrero
	Definir temperaturaMax, temperaturaMin, temperaturas Como Entero
	Definir mediamensual Como Real
	Definir dias0grados Como Entero
	temperaturaMax= -999
	temperaturaMin= 999
	suma = 0
	dias0grados = 0
	diaconmax = 0
	diaconmin = 0
	Para contador = 1 hasta 28
		Escribir "Introduce la temperatura que hizo el día " contador " de febrero"
		Leer  temperaturas
		suma = temperaturas + suma
		si temperaturas > temperaturaMax Entonces
			temperaturaMax = temperaturas
			diaconmax = contador
		FinSi
		Si temperaturas < temperaturaMin Entonces
			temperaturaMin = temperaturas
			diaconmin = contador
		FinSi
		Si temperaturas < 0 Entonces
			dias0grados = dias0grados + 1
		FinSi
	FinPara
	mediamensual = suma / 28
	Escribir "La temperatura máxima de febrero es de " temperaturaMax "º"
	Escribir "El dia que menos grados hizo en febrero, hicieron " temperaturaMin "º"
	Escribir "La temperatura media mensual ha sido de " mediamensual "º"
	Escribir "Los días con temperaturas menores de 0º es de " dias0grados " días"
	Escribir "El día del mes que hizo más calor fue el dia " diaconmax 
	Escribir "El día que mas frío hizo fue el día " diaconmin 
FinAlgoritmo
