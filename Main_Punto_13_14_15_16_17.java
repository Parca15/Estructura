package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Main_Punto_13_14_15_16_17 {
    public static void main(String[] args) {
        // Ejercicio #13
        System.out.println(" - - - - - - -   Ejercicio #13 - - - - - - -");

        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Set<Integer> pares = Encontrar_Num_pares.obtenerPares(numeros);
        System.out.println("Números pares: " + pares + "\n");

        // Ejercicio #14
        System.out.println(" - - - - - - -   Ejercicio #14 - - - - - - -");

        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("buscando");
        cadenas.add("Letras");
        cadenas.add("mayúsculas");
        cadenas.add("En");
        cadenas.add("Cadenas");

        List<String> mayusculas = Encontrar_Inicial_Mayuscula.obtenerCadenasMayusculas(cadenas);
        System.out.println("Cadenas con inicial en mayúscula: " + mayusculas + "\n");

        // Ejercicio #15
        System.out.println(" - - - - - - -   Ejercicio #15 - - - - - - -");

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("usando", 10);
        mapa.put("Hola", 20);
        mapa.put("Mapas", 30);
        mapa.put("palabras", 40);

        Map<String, Integer> minusculas = Unir_Palabras_Con_Numeros.filtrarClavesMinusculas(mapa);
        System.out.println("Entradas con claves en minúsculas: " + minusculas + "\n");

        // Ejercicio #16
        System.out.println(" - - - - - - -   Ejercicio #16 - - - - - - -");

        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(15);
        pila.push(20);
        pila.push(25);

        Stack<Integer> filtrados = Buscar_Condicion_En_Objetos.filtrarPila(pila, elemento -> elemento > 15);
        System.out.println("Elementos en la pila que son mayores a 15: " + filtrados + "\n");


        // Ejercicio #17
        System.out.println(" - - - - - - -   Ejercicio #17 - - - - - - -");

        /*
        HashMap:
        1. Orden de inserción: No garantiza ningún orden en las claves
        2. Rendimiento: Puede ser más rápido para operaciones básicas como incluír datos, buscarlos y eliminarlos
        3. Uso: Se utiliza cuando el orden de las claves no es importante
         */
        List<Map<String, Object>> productosHashMap = new ArrayList<>();
        Map<String, Object> producto1 = new HashMap<>();
        producto1.put("nombre", "Producto A");
        producto1.put("precio", 100);
        producto1.put("cantidad", 2);
        productosHashMap.add(producto1);

        Map<String, Object> producto2 = new HashMap<>();
        producto2.put("nombre", "Producto B");
        producto2.put("precio", 200);
        producto2.put("cantidad", 3);
        productosHashMap.add(producto2);

        System.out.println("Productos en HashMap: " + productosHashMap);

        /*
        LinkedHashMap:
        1. Orden de inserción: Mantiene el orden de inserción de las claves, es decir, que las claves se devolverán en el orden en que se indtrodujero
        2. Rendimiento: Puede ser más lento que HashMap ya que debe mantener el orden de las claves
        3. Uso: Se utiliza cuando se necesita mantener el orden de inserción de las claves
         */
        List<Map<String, Object>> productosLinkedHashMap = new ArrayList<>();
        Map<String, Object> producto3 = new LinkedHashMap<>();
        producto3.put("nombre", "Producto C");
        producto3.put("precio", 150);
        producto3.put("cantidad", 1);
        productosLinkedHashMap.add(producto3);

        Map<String, Object> producto4 = new LinkedHashMap<>();
        producto4.put("nombre", "Producto D");
        producto4.put("precio", 250);
        producto4.put("cantidad", 4);
        productosLinkedHashMap.add(producto4);

        System.out.println("Productos en LinkedHashMap: " + productosLinkedHashMap);

        /*
        TreeMap:
        Orden de claves: Mantiene las claves ordenadas normal en orden ascendente o personalizado si se lo codifica así
        Rendimiento: Es más lento que HashMap y LinkedHashMap en operaciones básicas ya que se debe mantener un orden
        Uso: Se utiliza cuando necesitas que las claves estén ordenadas de forma natural o cuando se lo personaliza
         */

        List<Map<String, Object>> productosTreeMap = new ArrayList<>();
        Map<String, Object> producto5 = new TreeMap<>();
        producto5.put("nombre", "Producto E");
        producto5.put("precio", 120);
        producto5.put("cantidad", 5);
        productosTreeMap.add(producto5);

        Map<String, Object> producto6 = new TreeMap<>();
        producto6.put("nombre", "Producto F");
        producto6.put("precio", 220);
        producto6.put("cantidad", 6);
        productosTreeMap.add(producto6);

        System.out.println("Productos en TreeMap: " + productosTreeMap);
    }
}
