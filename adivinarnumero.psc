Algoritmo NumeroAleatorio
	Definir secreto Como Entero
	Definir numeros Como Entero
	secreto = azar(100) + 1
	Escribir "Intenta adivinar el número"
	leer numeros
	// para ver el numero de intentos debemos poner contador y que sea igual a uno para por lo menos si aciertas a la primera sea un intento
	contador = 1
	Mientras (numeros <> secreto)
		Si (numeros > secreto) Entonces
			Escribir "Te has pasado!!"
		SiNo
			Escribir "Dime un numero más alto"
		FinSi
		Escribir "Dime otro número venga"
		leer numeros
		// se pone contador mas uno ya que cada intento sume un intento al respectivo contador
		contador = contador + 1
	FinMientras
	Escribir "POR FINNNN, INTENTOS " contador
FinAlgoritmo
