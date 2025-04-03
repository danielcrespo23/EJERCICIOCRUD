Algoritmo Ejercicio4
	Definir sueldos, antiguedad Como Entero
	contador = 0
	suma = 0
	Para contador = 1 hasta 40
		Escribir "Introduce el sueldo del empleado " contador 
		leer sueldos
		Escribir "Antiguedad del empleado"
		leer antiguedad
		Si antiguedad > 20 Entonces
			empleado20 = empleado20 + 1
		sino 
			empleado0 = empleado0 + 1
		FinSi
	
	FinPara
	Porcentaje20 = (empleado20 / (empleado20 + empleado0)) * 100
	Escribir "El porcentaje de empleados con más de 20años de antiguedad es del " Porcentaje20 " %"
	Escribir "Hay en total " empleado20 " con mas de 20 años de antiguedad"
FinAlgoritmo
