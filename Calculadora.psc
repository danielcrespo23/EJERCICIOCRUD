PROCESO Calculadora
	Definir Operador como Caracter
	Definir A, B como Entero
	Definir Resultado como Entero
	Escribir "Primer número :"
	Leer A
	Escribir "Segundo número:"
	Leer B
	Escribir " Operador :"
	Leer Operador
	Fallo = Falso
	Segun Operador Hacer
		'+': Resultado <- A+B
		'-': Resultado <- A-B
		'*': Resultado <- A*B
		'/': si ( B <> 0 ) Entonces
				Resultado <- A/B
			SiNo
				Escribir "ERROR NO SE PUEDE DIVIDIR POR CERO"
				Fallo = Verdadero
			FinSi
		De Otro Modo:
			Escribir " Operador incorrecto "
	FinSegun
	Si (fallo == Falso) Entonces
		Escribir " El resultado de la operacion es " Resultado
	FinSi
FINPROCESO
