package org.example;

import java.util.HashSet;
import java.util.Set;

public class Encontrar_Num_pares {

    public static Set<Integer> obtenerPares(Set<Integer> numeros) {

        if (numeros.isEmpty()) {
            return new HashSet<>();
        }

        Integer numero = numeros.iterator().next();
        numeros.remove(numero);

        Set<Integer> pares = obtenerPares(numeros);

        if (numero % 2 == 0) {
            pares.add(numero);
        }

        return pares;
    }
}
