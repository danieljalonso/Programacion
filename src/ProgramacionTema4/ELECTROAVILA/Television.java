package ProgramacionTema4.ELECTROAVILA;

public class Television extends Electrodomestico{

    double tamano;
    boolean esOLED;

    public Television(double precioBase, String color, char consumo, double peso, double tamano, boolean esOLED) {
        super(precioBase, color, consumo, peso);
        this.tamano = tamano;
        this.esOLED = esOLED;
        this.precioBase = reglasNegocio();
    }

    public Television(double precioBase, double peso) {
        super(precioBase, "Blanco", 'F', peso);
    }

    private double reglasNegocio() {
        return precioBase + reglaNegocioA() + reglaNegocioB();
    }
    private double reglaNegocioA() {
        if (tamano > 60) {
            return precioBase * 0.30;
        }
        return 0;
    }
    private int reglaNegocioB() {
        if (esOLED) {
            return 250;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "La television " + super.toString() + ", es de " + tamano + " pulgadas y " + (esOLED ? "es OLED" : "no es OLED");
    }
}
