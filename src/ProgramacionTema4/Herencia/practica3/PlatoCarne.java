package ProgramacionTema4.Herencia.practica3;

public class PlatoCarne extends Plato{

    String coccion;

    public PlatoCarne(String nombre, double precio, String coccion) {
        super(nombre, precio);
        this.coccion = coccion;
    }

    @Override
    public String toString() {
        return super.toString() + " y su punto de coccion es: " + coccion;
    }
}
