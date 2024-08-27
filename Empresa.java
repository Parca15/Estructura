package LaboratorioColecciones;

import java.util.TreeSet;

public class Empresa {
    private TreeSet<String> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(String producto) {
        productos.add(producto);
    }

    public String buscarProductoPorCodigo(String codigo) {
        for (String producto : productos) {
            if (producto.startsWith(codigo + ":")) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar algunos productos
        empresa.agregarProducto("001:Laptop");
        empresa.agregarProducto("002:Smartphone");
        empresa.agregarProducto("003:Tablet");

        // Buscar un producto por su código
        String productoBuscado = empresa.buscarProductoPorCodigo("002");
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
