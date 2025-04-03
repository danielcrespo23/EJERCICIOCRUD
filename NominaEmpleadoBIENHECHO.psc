Algoritmo NominaEmpleado
    Definir nombre, PlusSN, categoria Como Caracter
    Definir horasextras, anosantiguedad, Salario, ExtrasAnti Como Entero
    Salario = 0
    ExtrasAnti = 0
	
    Escribir "Dime el nombre del empleado"
    Leer nombre
	
    Escribir "Dime los años de Antiguedad"
    Leer anosantiguedad
    Si (anosantiguedad < 5) Entonces
        ExtrasAnti = 0
    FinSi
    Si (anosantiguedad >= 5) y (anosantiguedad <= 10) Entonces
        ExtrasAnti = 100
    FinSi
    Si (anosantiguedad >= 11) y (anosantiguedad <= 20) Entonces
        ExtrasAnti = 200
    FinSi
    Si (anosantiguedad > 20) Entonces
        ExtrasAnti = 300
    FinSi
	
    Escribir "¿Qué categoría es? (A, B o C)"
    Leer categoria
    Segun categoria Hacer
        'A': Salario = 600
        'B': Salario = 800
        'C': Salario = 1000
    FinSegun
	
    Escribir "Horas extras (0..N)"
    Leer horasextras
    Salario = Salario + (horasextras * 25)
	
    Escribir "Plus (S/N)"
    Leer PlusSN
    Segun PlusSN hacer
        'S' o 's': Salario = Salario + (Salario * 10) / 100
        'N' o 'n': Salario = Salario + 0
    FinSegun
	
    Salariotodoincluido = Salario + ExtrasAnti
    Escribir "La nómina de ", nombre, " es de ", Salariotodoincluido, " euros."
FinAlgoritmo
