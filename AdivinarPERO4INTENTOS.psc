Algoritmo NumeroAleatorio
    Definir secreto Como Entero
    Definir numeros Como Entero
    Definir contador Como Entero
    secreto = azar(10) + 1
    Escribir "Intenta adivinar el n�mero (tienes 4 intentos)"
    leer numeros
    contador = 1
	
    Mientras (numeros <> secreto Y contador < 4)
        Si (numeros > secreto) Entonces
            Escribir "Te has pasado!!"
        SiNo
            Escribir "Dime un n�mero m�s alto"
        FinSi
        Escribir "Dime otro n�mero venga"
        leer numeros
        contador = contador + 1
    FinMientras
	
    Si (numeros = secreto) Entonces
        Escribir "POR FINNNN, adivinaste en ", contador, " intentos."
    SiNo
        Escribir "Lo siento, has agotado tus 4 intentos. El n�mero era: ", secreto
    FinSi
FinAlgoritmo
