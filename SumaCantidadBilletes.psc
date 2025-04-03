Algoritmo SumaCantidadBilletes
	Definir billetes50 Como Entero
	Definir billetes20 Como Entero
	Definir billetes10 Como Entero
	Definir billetes5 Como Entero
	Definir monedas2 Como Entero
	Definir monedas1 Como Entero
	Definir sumatotal Como Entero
	Escribir "Dime la cantidad de billetes de 50?"
		Leer  billetes50 
	Escribir "Dime la cantidad de billetes de 20??"
		Leer  billetes20 
	Escribir "Dime la cantidad de billetes de 10??"
		Leer  billetes10 
	Escribir "Dime la cantidad de billetes de 5??"
		Leer  billetes5 
	Escribir "Dime la cantidad de monedas de 2??"
		Leer  monedas2 
	Escribir "Dime la cantidad de monedas de 1??"
		Leer  monedas1
		sumatotal <- (billetes50 * 50) + (billetes20 * 20) + (billetes10 * 10) + (billetes5 * 5) + (monedas2* 2) + (monedas1* 1)
	Escribir "El dinero total gastado es de " sumatotal " euros"
FinAlgoritmo
