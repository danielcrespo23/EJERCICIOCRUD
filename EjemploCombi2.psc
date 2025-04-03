Algoritmo EjemploCombi2
	Definir km Como Entero
	Definir tipossdia Como Caracter
	Definir precio Como Real
	Definir descuento Como Entero
	
	Escribir  "Introduce la distancia a recorrer"
	leer km
	
	Escribir "Dime el tipo de día"
	leer tipossdia
	
	descuento = 0
	
	si (km > 80)
		descuento = 15
	FinSi
	
	si (tipossdia == 'L')
		descuento = descuento + 5
	FinSi
	
	precio = km * 0.30 - (km * 0.30) * descuento/100
	Escribir "El precio del billete es " precio
FinAlgoritmo
