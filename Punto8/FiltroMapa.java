package Punto8;

import java.util.HashMap;
import java.util.Map;

public class FiltroMapa {

    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");

        Map<Integer, String> mapaFiltrado = filtrarClavesPares(mapa);
        System.out.println("Mapa filtrado (claves pares): " + mapaFiltrado);
    }

    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa) {
        if (mapa.isEmpty()) {
            return new HashMap<>();
        }

        Integer clave = mapa.keySet().iterator().next();
        String valor = mapa.get(clave);

        mapa.remove(clave);

        Map<Integer, String> restoDelMapa = filtrarClavesPares(mapa);

        if (clave % 2 == 0) {
            restoDelMapa.put(clave, valor);
        }

        return restoDelMapa;
    }
}