package ProgramacionTema4.Herencia.practica1;

public class FiguraCirculo extends Figuras{

    private double radio;

    public FiguraCirculo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double area() {
        return 3.14 * radio * radio;
    }
    public double perimetro() {
        return 2 * 3.14 * radio;
    }

    public String toString() {
        return "El circulo es " + color + ", su area es " + area() + " y su perimetro es " + perimetro();
    }

}
