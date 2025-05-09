
public class Opinion implements Comparable<Opinion> {

	private String contenido;	// Texto con el contenido de la opinión.
	private String serie;	// Nombre de la serie 
	private Calificacion valoracion;	// Valoración de producto  (ENUMERADO)
	private int	ident;
	
	private static int cont_opiniones = 0;
	
	public Opinion( String contenido, String serie, Calificacion calificacion) {
		this.contenido = contenido;
		this.serie = serie;
		this.valoracion = calificacion;
		cont_opiniones++;
		this.ident = cont_opiniones;
	}
	
	String getSerie() {
		return this.serie;
	}

	@Override
	public String toString() {
		return "Opinion [contenido=" + contenido + ", serie=" + serie + ", valoracion=" + valoracion + ", ident="
				+ ident + "]";
	}

	@Override
	public int compareTo(Opinion o) {
		return this.valoracion.ordinal() - o.valoracion.ordinal();
	}
	
	
}
