PROCESO CalcularEdad
	Definir Annio, Mes, Dia Como Entero
	Definir AnnioActual, MesActual, DiaActual Como Entero
	Definir Edad Como Entero
	Escribir "Introduce la fecha actual día, mes y año: "
	Leer DiaActual, MesActual, AnnioActual
	Escribir "Introduce tu fecha de nacimiento día, mes y año: "
	Leer Dia, Mes, Annio
	Si (MesActual > Mes ) o (( MesActual = Mes) y ( DiaActual >= Dia)) Entonces
		Edad <- AnnioActual - Annio
	Sino
		Edad <- AnnioActual - Annio -1
	FinSi
	Escribir " Tienes ", Edad, " Años."
	SI (( MesActual = Mes) y ( DiaActual = Dia)) Entonces
		Escribir "!!Es tu cumpleaños¡¡"
	FinSi
FinProceso