package MostrarImagen;

import javax.swing.*;
import java.awt.*;

public class mostrarimagen {
    public static void main(String[] args) {
        // Crear la ventana (JFrame)
        JFrame ventana = new JFrame("Mostrar Imagen JPG -- Real Madrid");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 400);

        // Cargar la imagen (asegúrate de que la ruta sea correcta)
        ImageIcon imagen = new ImageIcon("descarga.jpeg");

        // Crear un JLabel con la imagen
        JLabel etiqueta = new JLabel(imagen);

        // Añadir la imagen a la ventana
        ventana.add(etiqueta);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}

