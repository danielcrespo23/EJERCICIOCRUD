Algoritmo EjercicioMediaEdades
	Definir edad, sumaedades, cantidadedades, mayoresde50 Como Entero
	Definir mediaedad, porcentajemayor50 Como Real
	sumaedades = 0
	cantidadedades = 0
	mayoresde50 = 0
	Repetir
		Escribir "Introduce una edad (0 termina)"
		Leer  edad
		si edades < 0 Entonces
			Escribir "La edad no es valida introduce una nueva edad"
		SiNo
			si edad > 0 Entonces
				sumaedades = sumaedades + edad
				cantidadedades = cantidadedades + 1
			FinSi
			
			si edad > 50 Entonces
				mayoresde50 = mayoresde50 + 1
			FinSi
		FinSi
	Hasta Que edad = 0
	si cantidadedades > 0 Entonces
		mediaedad = sumaedades / cantidadedades
		porcentajemayor50 = (mayoresde50 / cantidadedades) * 100
	FinSi
	Escribir "La media de edad es " mediaedad
	Escribir "El porcentaje de mayores de 50 es del " porcentajemayor50 "%"
FinAlgoritmo
