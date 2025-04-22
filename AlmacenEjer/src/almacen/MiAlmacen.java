package almacen;

import java.util.*;

public class MiAlmacen {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Producto> productos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            switch (opcion) {
                case 1 -> nuevoProducto();
                case 2 -> consultaProducto();
                case 3 -> borrarProducto();
                case 4 -> modificarPrecio();
                case 5 -> compraProducto();
                case 6 -> ventaProducto();
                case 7 -> listadoProductos();
                case 8 -> productosBajoMinimo();
                case 9 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 9);
    }

    static void mostrarMenu() {
        System.out.println("""
            1. Nuevo producto
            2. Consulta producto
            3. Borrar producto
            4. Modificar precio
            5. Compra de productos
            6. Venta de productos
            7. Listado completo de productos
            8. Listado de productos con stock inferior al mínimo
            9. Terminar
        """);
    }

    static int leerOpcion() {
        try {
            System.out.print("Elige una opción: ");
            return Integer.parseInt(sc.nextLine());
        } catch (Exception e) {
            return -1;
        }
    }

    static Producto buscarProducto(int codigo) {
        for (Producto p : productos) {
            if (p.codigo == codigo) return p;
        }
        return null;
    }

    static void nuevoProducto() {
        try {
            System.out.print("Código: ");
            int codigo = Integer.parseInt(sc.nextLine());
            if (buscarProducto(codigo) != null) {
                System.out.println("Ya existe un producto con ese código.");
                return;
            }
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Stock actual: ");
            int stock = Integer.parseInt(sc.nextLine());
            System.out.print("Stock mínimo: ");
            int stockMin = Integer.parseInt(sc.nextLine());
            float precio = leerPrecio();

            if (stock <= 0 || precio <= 0) {
                System.out.println("Stock y precio deben ser mayores que 0.");
                return;
            }

            productos.add(new Producto(codigo, nombre, stock, stockMin, precio));
        } catch (Exception e) {
            System.out.println("Entrada inválida.");
        }
    }

    static float leerPrecio() {
        float precio = -1;
        while (precio <= 0) {
            try {
                System.out.print("Precio: ");
                precio = Float.parseFloat(sc.nextLine());
                if (precio <= 0) System.out.println("Debe ser mayor que 0.");
            } catch (Exception e) {
                System.out.println("Formato incorrecto.");
            }
        }
        return precio;
    }

    static void consultaProducto() {
        System.out.print("Código del producto: ");
        int codigo = Integer.parseInt(sc.nextLine());
        Producto p = buscarProducto(codigo);
        if (p != null) System.out.println(p);
        else System.out.println("Producto no encontrado.");
    }

    static void borrarProducto() {
        System.out.print("Código del producto: ");
        int codigo = Integer.parseInt(sc.nextLine());
        Producto p = buscarProducto(codigo);
        if (p != null) {
            System.out.println(p);
            System.out.print("¿Eliminar producto? (s/n): ");
            if (sc.nextLine().equalsIgnoreCase("s")) {
                productos.remove(p);
                System.out.println("Producto eliminado.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    static void modificarPrecio() {
        System.out.print("Código del producto: ");
        int codigo = Integer.parseInt(sc.nextLine());
        Producto p = buscarProducto(codigo);
        if (p != null) {
            System.out.println(p);
            float nuevoPrecio = leerPrecio();
            p.precio = nuevoPrecio;
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    static void compraProducto() {
        System.out.print("Código del producto: ");
        int codigo = Integer.parseInt(sc.nextLine());
        Producto p = buscarProducto(codigo);
        if (p != null) {
            System.out.print("Cantidad comprada: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            p.stock += cantidad;
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    static void ventaProducto() {
        System.out.print("Código del producto: ");
        int codigo = Integer.parseInt(sc.nextLine());
        Producto p = buscarProducto(codigo);
        if (p != null) {
            System.out.print("Cantidad vendida: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            if (cantidad > p.stock) {
                System.out.println("No hay suficiente stock.");
            } else {
                p.stock -= cantidad;
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    static void listadoProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    static void productosBajoMinimo() {
        for (Producto p : productos) {
            if (p.stock < p.stockMin) {
                System.out.println(p);
            }
        }
    }
}

