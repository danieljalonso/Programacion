package ProgramacionTema4.Herencia.practica3;

public class PlatoPostre extends Plato{

    boolean conAzucar;

    public PlatoPostre(String nombre, double precio, boolean conAzucar) {
        super(nombre, precio);
        this.conAzucar = conAzucar;
    }

    public boolean getconAzucar() {
        return conAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + (conAzucar ? " y es con azúcar" : " y es sin azúcar");
    }

}
