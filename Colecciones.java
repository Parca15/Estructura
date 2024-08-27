package LaboratorioColecciones;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
public class Colecciones {
    // PUNTO 4: Pila (Stack) que solo permite insertar elementos del mismo tipo
    private Stack<Object> pilaGenerica;

    public Colecciones() {
        pilaGenerica = new Stack<>();
    }

    public void pushEnPila(Object elemento) throws Exception {
        if (!pilaGenerica.isEmpty() && !elemento.getClass().equals(pilaGenerica.peek().getClass())) {
            throw new Exception("No se puede insertar un tipo diferente al de la cima de la pila.");
        }
        pilaGenerica.push(elemento);
    }

    public Object popDePila() {
        return pilaGenerica.pop();
    }

    public Object cimaDePila() {
        return pilaGenerica.peek();
    }

    public boolean pilaVacia() {
        return pilaGenerica.isEmpty();
    }

    // PUNTO 5: Lista sin duplicados e impresión con iteradores
    private Set<String> listaSinDuplicados = new HashSet<>();

    public void agregarElemento(String elemento) {
        listaSinDuplicados.add(elemento);
    }

    public void imprimirLista() {
        Iterator<String> iterador = listaSinDuplicados.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }

public static void main(String[] args) {
        try {
            // Crear una instancia de Colecciones
            Colecciones colecciones = new Colecciones();

            // Probar la pila con tipos iguales
            System.out.println("Probando pila con tipos iguales:");
            colecciones.pushEnPila(1);
            colecciones.pushEnPila(2);
            colecciones.pushEnPila(3);
            System.out.println("Cima de la pila: " + colecciones.cimaDePila());
            System.out.println("Sacar elemento de la pila: " + colecciones.popDePila());
            System.out.println("Cima de la pila después de sacar un elemento: " + colecciones.cimaDePila());

            // Probar la pila con tipos diferentes (debería lanzar excepción)
            try {
                colecciones.pushEnPila("Cadena");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Probar la lista sin duplicados
            System.out.println("\nProbando lista sin duplicados:");
            colecciones.agregarElemento("Elemento1");
            colecciones.agregarElemento("Elemento2");
            colecciones.agregarElemento("Elemento1"); // Duplicado
            colecciones.imprimirLista(); // Solo debería imprimir "Elemento1" y "Elemento2"

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}