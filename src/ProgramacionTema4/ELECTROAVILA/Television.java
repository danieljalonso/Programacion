package ProgramacionTema4.ELECTROAVILA;

public class Television extends Electrodomestico{

    double tamano;
    boolean sintonizadorTDT;

    public Television(double precioBase, String color, char consumo, double peso, double tamano, boolean sintonizadorTDT) {
        super(precioBase, color, consumo, peso);
        this.tamano = tamano;
        this.sintonizadorTDT = sintonizadorTDT;
    }

}
