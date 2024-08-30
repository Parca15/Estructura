package Punto9;

import java.util.Stack;

public class FiltroPila {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(6);
        pila.push(3);
        pila.push(8);
        pila.push(2);

        Stack<Integer> pilaFiltrada = filtrarPila(pila);
        System.out.println("Pila filtrada (elementos mayores a 5): " + pilaFiltrada);
    }

    public static Stack<Integer> filtrarPila(Stack<Integer> pila) {
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        Integer elemento = pila.pop();

        Stack<Integer> pilaFiltrada = filtrarPila(pila);

        if (elemento > 5) {
            pilaFiltrada.push(elemento);
        }

        return pilaFiltrada;
    }
}
