
public class TestAlmacenOP {

	public static void main(String[] args) {

		AlmacenOpiniones ao = new AlmacenOpiniones(10);

		ao.anotarOpinion(new Opinion(" Simpática",  "El relojero", Calificacion.BIEN)); 
		ao.anotarOpinion(new Opinion(" Pasable ",   "El relojero", Calificacion.BIEN));
		ao.anotarOpinion(new Opinion(" La leche ", "Corriendo a casa", Calificacion.EXCELENTE));
		ao.anotarOpinion(new Opinion(" Un rollo ",       "Un lugar lejano", Calificacion.REGULAR));
		ao.anotarOpinion(new Opinion(" Pésima ",         "Un lugar lejano", Calificacion.MAL));
		ao.anotarOpinion(new Opinion(" Me gusto mucho ", "Un lugar lejano", Calificacion.BIEN));
		ao.anotarOpinion(new Opinion(" Me dormí ",       "Un lugar lejano", Calificacion.REGULAR));
		ao.anotarOpinion(new Opinion(" Me encanto ",     "Un lugar lejano", Calificacion.EXCELENTE));
		ao.anotarOpinion(new Opinion(" Muy entretenida ","Un lugar lejano", Calificacion.BIEN)); // No se almacena
		
		ao.listar("Un lugar lejano");

	}

}

