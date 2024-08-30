package org.example;

import java.util.ArrayList;
import java.util.List;

public class Encontrar_Inicial_Mayuscula {

    public static List<String> obtenerCadenasMayusculas(List<String> cadenas) {

        if (cadenas.isEmpty()) {
            return new ArrayList<>();
        }

        String cadena = cadenas.get(0);
        List<String> resto = cadenas.subList(1, cadenas.size());

        List<String> mayusculas = obtenerCadenasMayusculas(resto);

        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            mayusculas.add(0, cadena);
        }

        return mayusculas;
    }
}
