Algoritmo Ejercicio5
	Definir cesta Como Caracter
	Definir importetotal, numerodecestas Como Entero
	Escribir "¿Que cesta necesitaria?"
	leer cesta
	Escribir "¿Cual seria la cantidad de ellas?"
	leer numerodecestas
	Segun cesta Hacer
		'A' o 'a' : preciocesta = 100
		'B' o 'b' : preciocesta = 200	
		'C' o 'c' : preciocesta = 300
	FinSegun
			importetotal = preciocesta * numerodecestas
			si (importetotal > 1000) Entonces
				Importecondescuento = Importetotal - (Importetotal * 0.10)
	FinSi
	Escribir "El importe total de las cestas es de " Importetotal "euros"
	Escribir "El importe ha sido de " Importetotal " por lo que se le aplica el 10% y se le quedaria en " Importecondescuento " euros	"
FinAlgoritmo
