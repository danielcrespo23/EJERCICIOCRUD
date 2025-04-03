Algoritmo CalculoPrecio
	Definir zona Como Entero
	Definir peso Como Real
	
	Escribir " Indique el peso en gramos del paquete "
	Leer peso
	si ( peso > 5000 ) Entonces
		Escribir  " el paquete supera el peso máximo "
	SiNo
		Escribir " Indique la zona destino "
		Escribir " 1-America del Norte "
		Escribir " 2-America Central "
		Escribir " 3- America del Sur "
		Escribir " 4-Europa "
		Escribir " 5- Asia " 
		leer zona
		costoporgramo = 0
		segun (zona ) Hacer
			1: costoporgramo = 24
			2: costoporgramo = 20
			3: costoporgramo = 21
			4: costoporgramo = 10
			5: costoporgramo = 18
			De otro modo:
			Escribir " Error en un destino " 
	FinSegun
	si (costoporgramo <> 0 )
	FinSi
	Finsi
	Escribir  " el precio es ", costoporgramo*peso
FinAlgoritmo
