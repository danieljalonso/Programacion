package ProgramacionTema4.Herencia.practica1;

public class FiguraCuadrado extends Figuras{

    private double lado;

    public FiguraCuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double area() {
        return lado * 2;
    }
    public double perimetro() {
        return lado * 4;
    }

    public String toString() {
        return "El cuadrado es " + color + ", su area es " + area() + " y su perimetro es " + perimetro();
    }

}
