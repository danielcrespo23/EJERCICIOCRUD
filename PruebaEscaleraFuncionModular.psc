Algoritmo PruebaEscalera
    
    Escribir "Una escalera de tama�o 5"
    Escalera(5);
    
    Escribir "Una escalera de tama�o 10"
    Escalera(10);
    
FinAlgoritmo

// Es un procedimiento no devuelve nada
funcion Escalera( tama�o )
    
    para i=1 hasta tama�o
        para j=1 hasta i
            Escribir "*" sin saltar
        FinPara
        Escribir ""  // Salta de linea 
    FinPara    
    
	FinFuncion
