package LaboratorioColecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Persona otra) {
        // Comparar por edad primero
        int comparacionEdad = Integer.compare(this.edad, otra.edad);
        if (comparacionEdad != 0) {
            return comparacionEdad;
        }
        // Si las edades son iguales, comparar por nombre
        return this.nombre.compareTo(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años, " + genero + ")";
    }
    public static void main(String[] args) {
        // Crear una lista de objetos Persona
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Ana", 25, "Femenino"));
        listaPersonas.add(new Persona("Carlos", 30, "Masculino"));
        listaPersonas.add(new Persona("Beatriz", 22, "Femenino"));
        listaPersonas.add(new Persona("David", 30, "Masculino"));
        listaPersonas.add(new Persona("Laura", 25, "Femenino"));


        // Ordenar la lista utilizando la implementación de compareTo en Persona
        Collections.sort(listaPersonas);

        // Mostrar la lista después de ordenar
        System.out.println("\nLista de personas después de ordenar:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

