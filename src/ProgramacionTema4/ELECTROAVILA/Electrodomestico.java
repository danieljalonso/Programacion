package ProgramacionTema4.ELECTROAVILA;

public abstract class Electrodomestico {

    double precioBase;
    String color;
    char consumo;
    double peso;

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        this.color = registrarColor();
        this.consumo = registrarConsumo();
        this.peso = peso;
    }

    private String registrarColor() {
        String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        for (String c : colores) {
            if (color.equals(c)) {
                return color;
            }
        }
        return "Blanco";
    }

    private char registrarConsumo() {
        if (consumo >= 'A' && consumo <= 'F') {
            return consumo;
        }
        return 'F';
    }

}
