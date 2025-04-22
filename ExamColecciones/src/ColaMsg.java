import java.util.ArrayList;
/*
 * Salida del programa:
Número de mensajes 3
 Contenido de la lista:
[Primero, Otro, Ultimo]
 El mensaje más antiguo es Primero
 Número de mensajes 2
 Contenido de la lista:
[Otro, Ultimo]

 */

public class ColaMsg {

	private  ArrayList <String> cola;
	
	ColaMsg (){
		cola = new ArrayList <String>();
	}
	
	/**
	 * Añade un mensaje al final de la lista
	 * @param msg
	 */
	void pon(String msg) {
		cola.add(msg);
	}
	
	/**
	 * Borra y Devuelve el primer mensaje de la lista o NULL si  no hay ninguno
	 * @return
	 */
	String dame () {
		
		if (!cola.isEmpty()) {
			return cola.remove(0);
		}
		return null;
	}


	
	/**
	 *  Devuelve el número de mensajes almacenados
	 * @return int
	 */
	int numMensajes() {
	    return cola.size();
	}
	
	
	/**
	 *  Muestre todos los mensajes en la lista
	 */
	void verMensajes () {
		for (String msg : cola) {
			System.out.println(msg);
		}
	}
	
	

	// Prueba de la clase
	public static void main(String[] args) {
		
	ColaMsg cmensajes = new ColaMsg();
		
	cmensajes.pon("Primero");
	cmensajes.pon("Otro");
	cmensajes.pon("Ultimo");
		
	System.out.println(" Número de mensajes "+ cmensajes.numMensajes());
	System.out.println(" Contenido de la lista:");
	cmensajes.verMensajes();
		
	String valor = cmensajes.dame();
	System.out.println(" El mensaje más antiguo es "+ valor);
		
	System.out.println(" Número de mensajes "+ cmensajes.numMensajes());
	System.out.println(" Contenido de la lista:");
	cmensajes.verMensajes();
						
	}
}
