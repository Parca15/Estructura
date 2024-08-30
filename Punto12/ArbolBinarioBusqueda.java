package Punto12;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda {
    public static void main(String[] args) {
        Nodo raiz = new Nodo(10);
        raiz.izquierda = new Nodo(5);
        raiz.derecha = new Nodo(15);
        raiz.izquierda.izquierda = new Nodo(3);
        raiz.izquierda.derecha = new Nodo(7);
        raiz.derecha.izquierda = new Nodo(12);
        raiz.derecha.derecha = new Nodo(18);

        List<Integer> elementosEnOrden = inorden(raiz);
        System.out.println("Elementos del árbol en orden ascendente: " + elementosEnOrden);
    }

    public static List<Integer> inorden(Nodo nodo) {
        List<Integer> resultado = new ArrayList<>();

        if (nodo == null) {
            return resultado;
        }

        resultado.addAll(inorden(nodo.izquierda));

        resultado.add(nodo.valor);

        resultado.addAll(inorden(nodo.derecha));

        return resultado;
    }
}
