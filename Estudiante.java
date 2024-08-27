package LaboratorioColecciones;

import java.util.HashMap;
import java.util.Map;

public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String genero, String matricula) {
        super(nombre, edad, genero);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    // Método para crear un mapa que asocie el número de matrícula con el objeto Estudiante
    public static Map<String, Estudiante> crearMapaDeEstudiantes(Estudiante[] listaEstudiantes) {
        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();

        for (Estudiante estudiante : listaEstudiantes) {
            mapaEstudiantes.put(estudiante.getMatricula(), estudiante);
        }

        return mapaEstudiantes;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getEdad() + " años, " + getGenero() + ") - Matrícula: " + matricula;
    }
    public static void main(String[] args) {
        // Crear algunos objetos Estudiante
        Estudiante estudiante1 = new Estudiante("Carlos Pérez", 20, "Masculino", "MAT001");
        Estudiante estudiante2 = new Estudiante("Ana Gómez", 22, "Femenino", "MAT002");
        Estudiante estudiante3 = new Estudiante("Luis Martínez", 19, "Masculino", "MAT003");

        // Crear un arreglo de estudiantes
        Estudiante[] listaEstudiantes = {estudiante1, estudiante2, estudiante3};

        // Crear el mapa de estudiantes usando el método estático
        Map<String, Estudiante> mapaEstudiantes = Estudiante.crearMapaDeEstudiantes(listaEstudiantes);

        // Imprimir los estudiantes del mapa
        for (Map.Entry<String, Estudiante> entry : mapaEstudiantes.entrySet()) {
            System.out.println("Matrícula: " + entry.getKey() + " - " + entry.getValue());
        }

        // Buscar un estudiante por matrícula y mostrar la información
        String matriculaABuscar = "MAT002";
        Estudiante estudianteEncontrado = mapaEstudiantes.get(matriculaABuscar);
        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado);
        } else {
            System.out.println("Estudiante con matrícula " + matriculaABuscar + " no encontrado.");
        }
    }
}
