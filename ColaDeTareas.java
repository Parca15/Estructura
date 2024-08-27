package LaboratorioColecciones;
import java.util.PriorityQueue;

public class ColaDeTareas {
    // Cola (Queue) con PriorityQueue para Tarea
    private PriorityQueue<Tarea> colaDeTareas = new PriorityQueue<>();

    public void agregarTarea(String descripcion, int prioridad) {
        Tarea nuevaTarea = new Tarea(descripcion, prioridad);
        colaDeTareas.add(nuevaTarea);
    }

    public Tarea procesarTarea() {
        return colaDeTareas.poll();
    }

    public boolean colaVacia() {
        return colaDeTareas.isEmpty();
    }

    // Clase Tarea utilizada en el punto 6
    class Tarea implements Comparable<Tarea> {
        private String descripcion;
        private int prioridad; // Menor número significa mayor prioridad

        public Tarea(String descripcion, int prioridad) {
            this.descripcion = descripcion;
            this.prioridad = prioridad;
        }

        @Override
        public int compareTo(Tarea otra) {
            return Integer.compare(this.prioridad, otra.prioridad);
        }

        @Override
        public String toString() {
            return "Tarea: " + descripcion + " (Prioridad: " + prioridad + ")";
        }
    }


    public static void main(String[] args) {
        // Crear una instancia de ColaDeTareas
        ColaDeTareas cola = new ColaDeTareas();

        // Agregar algunas tareas a la cola con diferentes prioridades
        cola.agregarTarea("Tarea urgente", 1);
        cola.agregarTarea("Tarea importante", 2);
        cola.agregarTarea("Tarea normal", 3);
        cola.agregarTarea("Tarea urgente", 1);

        // Procesar las tareas en orden de prioridad
        System.out.println("Procesando tareas según prioridad:");
        while (!cola.colaVacia()) {
            Tarea tarea = cola.procesarTarea();
            System.out.println(tarea);
        }
    }
}