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
		Escribir "Introduce la temperatura que hizo el d�a " contador " de febrero"
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
	Escribir "La temperatura m�xima de febrero es de " temperaturaMax "�"
	Escribir "El dia que menos grados hizo en febrero, hicieron " temperaturaMin "�"
	Escribir "La temperatura media mensual ha sido de " mediamensual "�"
	Escribir "Los d�as con temperaturas menores de 0� es de " dias0grados " d�as"
	Escribir "El d�a del mes que hizo m�s calor fue el dia " diaconmax 
	Escribir "El d�a que mas fr�o hizo fue el d�a " diaconmin 
FinAlgoritmo
