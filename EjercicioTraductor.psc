Algoritmo EjercicioTraductor
	Definir letra Como Caracter
	Escribir " Introduce una letra (C, I, F, A): "
	Leer letra
	Segun letra Hacer
		'C' , 'c' : mensaje = "Hola"
		'I' , 'i' : mensaje = "Ciao"
        'F', 'f': mensaje = "Bonjour"
		'A' , 'a': mensaje = "Hallo"
        De Otro Modo:
            Escribir "Hello"
	FinSegun
	Escribir mensaje
FinAlgoritmo
