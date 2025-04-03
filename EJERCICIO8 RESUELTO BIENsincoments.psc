Algoritmo Ejercicio8notas
    Definir notas Como Real
    Definir sumaA, sumaB Como Real
    Definir aprobadoA, aprobadoB, suspensoA, suspensoB Como Entero
    Definir mediaA, mediaB, mediaTotal Como Real
    aprobadoA <- 0
    aprobadoB <- 0
    suspensoA <- 0
    suspensoB <- 0
    sumaA <- 0
    sumaB <- 0
    Para contador <- 1 Hasta 30 Hacer
        Escribir "Introduce la nota del alumno ", contador
        Leer notas  
        Si (contador % 2 == 1) Entonces  
            sumaA <- sumaA + notas
            Si  (notas >= 5) Entonces
                aprobadoA <- aprobadoA + 1
            Sino
                suspensoA <- suspensoA + 1
            FinSi
        Sino  // Examen B (pares)
            sumaB <- sumaB + notas
            Si (notas >= 5) Entonces
                aprobadoB <- aprobadoB + 1
            Sino
                suspensoB <- suspensoB + 1
            FinSi
        FinSi
    Fin Para
    mediaA <- sumaA / (aprobadoA + suspensoA)  
    mediaB <- sumaB / (aprobadoB + suspensoB)  
    mediaTotal <- (sumaA + sumaB) / 30         
    PorsuspensoA <- (suspensoA / (aprobadoA + suspensoA)) * 100
    PorsuspensoB <- (suspensoB / (aprobadoB + suspensoB)) * 100
    PorcentajeAprobadosA <- (aprobadoA / (aprobadoA + suspensoA)) * 100
    PorcentajeAprobadosB <- (aprobadoB / (aprobadoB + suspensoB)) * 100
    Escribir "La nota media de los exámenes del modelo A es ", mediaA
    Escribir "La nota media de los exámenes del modelo B es ", mediaB
    Escribir "El porcentaje de suspensos del modelo A es ", PorsuspensoA, "%"
    Escribir "El porcentaje de suspensos del modelo B es ", PorsuspensoB, "%"
    Escribir "El porcentaje de aprobados del modelo A es ", PorcentajeAprobadosA, "%"
    Escribir "El porcentaje de aprobados del modelo B es ", PorcentajeAprobadosB, "%"
    Escribir "La nota media total de los exámenes es ", mediaTotal
Fin Algoritmo