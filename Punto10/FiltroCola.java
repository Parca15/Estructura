package Punto10;

import java.util.LinkedList;
import java.util.Queue;

public class FiltroCola {
    public static void main(String[] args) {
        Queue<Producto> cola = new LinkedList<>();
        cola.offer(new Producto("Manzana", 1.5));
        cola.offer(new Producto("Café", 12.0));
        cola.offer(new Producto("Pan", 3.0));
        cola.offer(new Producto("Vino", 15.0));
        cola.offer(new Producto("Queso", 8.5));

        Queue<Producto> colaFiltrada = filtrarCola(cola);
        System.out.println("Cola filtrada (productos menores de $10): " + colaFiltrada);
    }

    public static Queue<Producto> filtrarCola(Queue<Producto> cola) {
        if (cola.isEmpty()) {
            return new LinkedList<>();
        }

        Producto producto = cola.poll();

        Queue<Producto> colaFiltrada = filtrarCola(cola);

        if (producto.getPrecio() < 10) {
            colaFiltrada.offer(producto);
        }

        return colaFiltrada;
    }
}
