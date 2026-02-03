package ProgramacionTema4.Herencia.PruebaVideojuegos;

public class Videojuego {
    private String nombre;
    private double precio;

    public Videojuego(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString() {
        return nombre + "(" + precio + "€)";
    }
}
