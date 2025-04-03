Algoritmo NominaEmpleado
	Definir nombre, PlusSN, categoria Como Caracter
	Definir horasextras, anosantiguedad, Salario, ExtrasAnti Como Entero
	Salario = 0
	ExtrasAnti = 0
	Escribir "Dime el nombre del empleado"
	Leer nombre
	
	Escribir "Dime los años de Antiguedad"
	Leer anosantiguedad
	Si (anosantiguedad < 4) Entonces
		ExtrasAnti = 0
	FinSi
	Si (anosantiguedad >= 5) y (anosantiguedad <= 10) Entonces
		ExtrasAnti = 100
	FinSi
	Si (anosantiguedad >= 10) y (anosantiguedad <= 20) Entonces
		Salario = 200
	FinSi
	Si (anosantiguedad > 20) Entonces
		Salario = 300
	FinSi
	
	Escribir "Horas extras (0..N)"
	Leer  horasextras
	Salario = Salario + (horasextras * 25)
	
	Escribir "Plus (S/N)"
	Leer PlusSN
	Segun PlusSN hacer
		'S' : SalarioS = Salario + (Salario * 10) / 100
		'N' : Salario = Salario + 0
	FinSegun
	Escribir "¿Que categoria es?"
	leer categoria
	Segun categoria Hacer
		'A' : Salario = 600
		'B' : Salario = 800
		'C' : Salario = 1000
	FinSegun
Salariotodoincluido = Salario + ExtrasAnti
Escribir "La nomina de es de " Salariotodoincluido
FinAlgoritmo
