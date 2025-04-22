package almacenHashMap;

public class Producto {
    int codigo;
    String nombre;
    int stock;
    int stockMin;
    float precio;

    public Producto(int codigo, String nombre, int stock, int stockMin, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.stockMin = stockMin;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Stock: " + stock +
               ", Stock mínimo: " + stockMin + ", Precio: " + precio;
    }
}
