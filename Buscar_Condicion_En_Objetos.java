package org.example;

import java.util.Stack;
import java.util.function.Predicate;

public class Buscar_Condicion_En_Objetos {

    public static <T> Stack<T> filtrarPila(Stack<T> pila, Predicate<T> condicion) {

        if (pila.isEmpty()) {
            return new Stack<>();
        }

        T elemento = pila.pop();

        Stack<T> resultado = filtrarPila(pila, condicion);
        
        if (condicion.test(elemento)) {
            resultado.push(elemento);
        }

        return resultado;
    }
}
