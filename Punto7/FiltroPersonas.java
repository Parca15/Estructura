package Punto7;

import java.util.ArrayList;
import java.util.List;

public class FiltroPersonas {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 17));
        personas.add(new Persona("María", 22));
        personas.add(new Persona("Ana", 16));
        personas.add(new Persona("Pedro", 19));

        List<Persona> mayoresDeEdad = filtrarMayoresDeEdad(personas);
        System.out.println("Personas mayores de edad: " + mayoresDeEdad);
    }

    public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas) {
        if (personas.isEmpty()) {
            return new ArrayList<>();
        }

        Persona primeraPersona = personas.get(0);

        List<Persona> restoDePersonas = filtrarMayoresDeEdad(personas.subList(1, personas.size()));

        if (primeraPersona.getEdad() >= 18) {
            restoDePersonas.add(0, primeraPersona);
        }

        return restoDePersonas;
    }
}
