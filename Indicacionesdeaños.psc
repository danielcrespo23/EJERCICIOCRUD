PROCESO CalcularEdad
	Definir Annio, Mes, Dia Como Entero
	Definir AnnioActual, MesActual, DiaActual Como Entero
	Definir Edad Como Entero
	Escribir "Introduce la fecha actual d�a, mes y a�o: "
	Leer DiaActual, MesActual, AnnioActual
	Escribir "Introduce tu fecha de nacimiento d�a, mes y a�o: "
	Leer Dia, Mes, Annio
	Si (MesActual > Mes ) o (( MesActual = Mes) y ( DiaActual >= Dia)) Entonces
		Edad <- AnnioActual - Annio
	Sino
		Edad <- AnnioActual - Annio -1
	FinSi
	Escribir " Tienes ", Edad, " A�os."
	SI (( MesActual = Mes) y ( DiaActual = Dia)) Entonces
		Escribir "!!Es tu cumplea�os��"
	FinSi
FinProceso