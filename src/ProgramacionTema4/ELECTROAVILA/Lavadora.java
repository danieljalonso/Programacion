package ProgramacionTema4.ELECTROAVILA;

public class Lavadora extends Electrodomestico{

    double carga;

    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
        this.precioBase = reglaNegocio();
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, "Blanco", 'F', peso);
    }

    private double reglaNegocio() {
        if (carga > 30) {
            return precioBase * 1.10;
        }
        return precioBase;
    }

    @Override
    public String toString() {
        return "La lavadora " + super.toString() + " y aguanta " + carga + "kg de carga";
    }
}
