Algoritmo NotaAlumnos
	Definir nombre Como Caracter
	Definir notas Como Real
	Definir mensaje Como Caracter
	Escribir "Dime tu nombre para poder mirar tu nota"
	leer nombre
	Escribir "Esta vez dime la nota " nombre " porfavor"
	leer notas
	Si (notas < 5) Entonces
		Escribir "INSUFICIENTE"
	sino Si (notas > 5) y (notas < 6) Entonces
		Escribir "SUFICIENTE"
	SiNo Si ( notas > 6) y (notas < 7) Entonces
			Escribir "BIEN"
	SiNo Si (notas > 7) y (notas < 8.5)	
		Escribir "NOTABLE"
	Sino Si (notas >= 8.5)
			Escribir "Sobresaliente"
		FinSi
	FinSi
FinSi
Finsi
Finsi
FinAlgoritmo
