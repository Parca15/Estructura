package org.example;

import java.util.HashMap;
import java.util.Map;

public class Unir_Palabras_Con_Numeros {

    public static Map<String, Integer> filtrarClavesMinusculas(Map<String, Integer> mapa) {

        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map.Entry<String, Integer> entrada = mapa.entrySet().iterator().next();
        mapa.remove(entrada.getKey());

        Map<String, Integer> resultado = filtrarClavesMinusculas(mapa);

        if (!entrada.getKey().isEmpty() && Character.isLowerCase(entrada.getKey().charAt(0))) {
            resultado.put(entrada.getKey(), entrada.getValue());
        }

        return resultado;
    }
}
