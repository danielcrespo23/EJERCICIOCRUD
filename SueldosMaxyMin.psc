Algoritmo SueldosMaxyMin
	Definir sueldo1 Como Entero
	Definir sueldo2 Como Entero
	Definir sueldo3 Como Entero
	Repetir
		Escribir "Introduce los difentes sueldos"
		leer sueldo1
		leer sueldo2
		leer sueldo3
		Si (sueldo1 > sueldo2) y (sueldo2 > sueldo3) Entonces
			Escribir "El mayor es " sueldo1
			Escribir "El menor es " sueldo3
		SiNo
			si (sueldo2 > sueldo3) Entonces
				Escribir "El mayor sueldo es " sueldo2
				Escribir "El menor es " sueldo3
			sino 
				si (sueldo3 > sueldo2) Entonces
					Escribir "El mayor es " sueldo3
					Escribir "El menor es " sueldo2
				FinSi
			FinSi
		FinSi
	Hasta Que (sueldo1 = 0)
FinAlgoritmo
