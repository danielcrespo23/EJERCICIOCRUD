PROCESO MensajeSN
		// Pide confirmación para continuar
		Definir letra Como Caracter
		Repetir
			Escribir 'Procesado datos ... desea continuar (S/N):'
			Leer letra
		Hasta Que (letra='N' o letra='n')
		Escribir 'Adios'
FinProceso
