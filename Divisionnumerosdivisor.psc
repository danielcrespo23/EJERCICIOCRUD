Algoritmo Divisionnumeros
	Definir nu1, nu2 Como real
	Definir division Como real
	Escribir "Dime dos números para poder realizar la división"
	Leer nu1
	Leer nu2
	division = nu1 % nu2
	si (division = 0) Entonces
		Escribir "ERROR"
	SiNo
		Escribir "La división entre los dos números es " division
	FinSi
FinAlgoritmo
