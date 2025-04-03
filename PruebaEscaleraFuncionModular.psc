Algoritmo PruebaEscalera
    
    Escribir "Una escalera de tamaño 5"
    Escalera(5);
    
    Escribir "Una escalera de tamaño 10"
    Escalera(10);
    
FinAlgoritmo

// Es un procedimiento no devuelve nada
funcion Escalera( tamaño )
    
    para i=1 hasta tamaño
        para j=1 hasta i
            Escribir "*" sin saltar
        FinPara
        Escribir ""  // Salta de linea 
    FinPara    
    
	FinFuncion
