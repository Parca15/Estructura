package Punto11;

import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Manzana", 1.5));
        productos.add(new Producto("Café", 12.0));
        productos.add(new Producto("Pan", 3.0));
        productos.add(new Producto("Vino", 15.0));
        productos.add(new Producto("Queso", 8.5));

        List<Producto> productosOrdenados = quicksort(productos);
        System.out.println("Productos ordenados por precio: " + productosOrdenados);
    }

    public static List<Producto> quicksort(List<Producto> productos) {
        if (productos.size() <= 1) {
            return productos;
        }

        Producto pivote = productos.get(0);

        List<Producto> menores = new ArrayList<>();
        List<Producto> iguales = new ArrayList<>();
        List<Producto> mayores = new ArrayList<>();

        for (Producto producto : productos) {
            if (producto.getPrecio() < pivote.getPrecio()) {
                menores.add(producto);
            } else if (producto.getPrecio() > pivote.getPrecio()) {
                mayores.add(producto);
            } else {
                iguales.add(producto);
            }
        }

        List<Producto> resultado = new ArrayList<>();
        resultado.addAll(quicksort(menores));
        resultado.addAll(iguales);
        resultado.addAll(quicksort(mayores));

        return resultado;
    }
}
