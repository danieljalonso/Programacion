package ProgramacionTema4.Excepciones.Ejercicio_4;

public class ProductosMain {
    public static void main(String[] args) {
        Producto producto = new Producto();

        try {
            addProducto(producto, 25);
            addProducto(producto, -5);
        } catch (ValorInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void addProducto(Producto producto, double precio) throws ValorInvalidoException {
        producto.establecerPrecio(precio);
    }
}
