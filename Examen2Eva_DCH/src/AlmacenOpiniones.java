import java.util.Arrays;
import java.util.Iterator;

public class AlmacenOpiniones {
	Opinion topiniciones[];
	int contOpiniones; 
	
	public AlmacenOpiniones(int tamaño) {
		topiniciones = new Opinion[tamaño]; 
        contOpiniones = 0; 
	}

	boolean anotarOpinion(Opinion op) {
		int conteoOpinionesSerie = 0;
        for (int i = 0; i < contOpiniones; i++) {
            if (topiniciones[i].getSerie().equals(op.getSerie())) {
                conteoOpinionesSerie++;
            }
        }

        if (conteoOpinionesSerie < 5 && contOpiniones < topiniciones.length) {
        	topiniciones[contOpiniones] = op;
            contOpiniones++;
            return true;
        } else {
            return false;
        }
    }

	public void listar (String serie) {
	        for (int i = 0; i < contOpiniones; i++) {
	        	if (topiniciones[i].getSerie().equals(serie)) {
	           System.out.println(topiniciones[i]);
	           
	            }
	        }
	}
}
