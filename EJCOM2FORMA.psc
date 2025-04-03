Algoritmo EJCOM2FORMA
	Definir n1, n2, n3 como enteros
	Definir mayor Como Entero
	Escribir "  Introduce 3 números "
	leer n1, n2, n3
	Si (n1 > n2) y (n2 > n3) Entonces
		mayor = n1
	SiNo
		si (n2 > n3 ) Entonces
			mayor = n2
		sino
			si ( n3 > n2 ) Entonces
			mayor = n3
		FinSi
	FinSi
	
		
	FinSi
	Escribir  " el mayor es " mayor
FinAlgoritmo
