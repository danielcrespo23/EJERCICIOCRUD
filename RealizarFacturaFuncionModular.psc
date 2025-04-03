Algoritmo RealizarFactura
	Definir UnidadesA, UnidadesB, UnidadesC Como Entero
	Definir PrecioA, PrecioB, PrecioC Como Entero
	
	// Leo la lista de precios
	LeerPrecio(PrecioA,'A');
	LeerPrecio(PrecioB,'B');
	LeerPrecio(PrecioC,'C');
	// Leo las unidades compradas
	LeerUnidades(UnidadesA,'A');
	LeerUnidades(UnidadesB,'B');
	LeerUnidades(UnidadesC,'C');
	Escribir " FACTURA:"
	// Muestreo el importe de cada articulo por la cantidas
	MostrarPxU(PrecioA,UnidadesA,'A');
	MostrarPxU(PrecioB,UnidadesB,'B');
	MostrarPxU(PrecioC,UnidadesC,'C');
	// Muestro el importe bruto, sin hay descuento, el IVA y total factura
	CalcularMostrarImportes(PrecioA,PrecioB,PrecioC,unidadesA,unidadesB,unidadesC)
FinAlgoritmo

//--- FUNCION leerPrecio
funcion LeerPrecio (precio Por Referencia, tipo)
	Mostrar "Introduzca el precio para el articulo ",tipo
	Leer precio
	MIENTRAS (precio <= 0 )
		Mostrar "Precio debe ser mayor que cero "
		Leer Precio
	FINMIENTRAS
FinFuncion

//--FUNCION LeerUnidades
funcion LeerUnidades (unidades Por Referencia, tipo)
	Mostrar "Introduzca el unidades para el articulo ",tipo
	Leer unidades
	MIENTRAS (unidades < 0 )
		Mostrar "La unidades no pueden ser negativas"
		Leer Unidades
	FINMIENTRAS
FinFuncion

//--Funcion MostrarPxU
funcion MostrarPxU (precio, unidades, tipo)
	SI ( Unidades > 0 )
		ENTONCES
		Mostrar "Unidades de ", tipo,"      ", Unidades," x ",Precio, '  .............................', Unidades * Precio
	FINSI
FinFuncion


//-- FUNCION CalcularMostrarImportes
funcion CalcularMostrarImportes(PrecioA,PrecioB,PrecioC,UnidadesA,UnidadesB,UnidadesC)
	Definir Importe, Descuento, IVA Como Real
	
	Importe = (PrecioA*UnidadesA)+ (PrecioB*UnidadesB) + (PrecioC*UnidadesC)
	Escribir "                                            Importe Bruto : ", Importe
	SI ( Importe >= 1000) | ( (UnidadesA >0 ) & (UnidadesB > 0) & (UnidadesC > 0) )
		ENTONCES
		Descuento = Importe * 0.10
		Escribir "                                           Descuento 10 % : ", Descuento
		Importe = Importe - Descuento
		Escribir "                                            Importe Total : ", Importe
	FinSi
	
	IVA = Importe * 0.14
	Escribir "                                                 IVA 14 % : ", IVA
	Importe = Importe + IVA
	Escribir "                                    IMPORTE TOTAL FACTURA : ", Importe
	Escribir "Fin de factura"
FinFuncion