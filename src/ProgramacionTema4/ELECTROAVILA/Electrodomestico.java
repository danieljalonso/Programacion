package ProgramacionTema4.ELECTROAVILA;

public abstract class Electrodomestico {

    final static String[] COLORES = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};

    double precioBase;
    String color;
    char consumo;
    double peso;
    double precioFinal;

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        this.color = registrarColor(color);
        this.consumo = registrarConsumo(consumo);
        this.peso = peso;

        this.precioFinal = calcularPrecioFinal();
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, "Blanco", 'F', peso);
    }

    private String registrarColor(String color) {
        for (String c : COLORES) {
            if (color.equals(c)) {
                return color;
            }
        }
        return "Blanco";
    }

    private char registrarConsumo(char consumo) {
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        }
        return 'F';
    }

    private double calcularPrecioFinal() {
        return precioBase + precioBase * ((precioFinalConsumo() + precioFinalPeso()) / 100.0);
    }
    private int precioFinalConsumo() {
        return switch (consumo - 65) {
            case 1 -> 10;
            case 2 -> 15;
            case 0 -> 5;
            case 3 -> 20;
            case 4 -> 25;
            case 5 -> 30;
            default -> 0;
        };
    }
    private int precioFinalPeso() {
        if (peso > 50) {
            return 25;
        }
        return 0;
    }

    public String toString() {
        return "cuesta " + String.format("%.2f", precioFinal) + "€, es de color " + color + ", su consumo es '" + consumo + "', pesa " + peso + "kg";
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

}
