package ProgramacionTema4.Herencia.practica3;

public class PlatoPrimero extends Plato{

    boolean paraCompartir;

    public PlatoPrimero(String nombre, double precio, boolean paraCompartir) {
        super(nombre, precio);
        this.paraCompartir = paraCompartir;
    }

    @Override
    public String toString() {
        return super.toString() + (paraCompartir ? " y es para compartir" : " y no es para compartir");
    }
}
