package ProgramacionTema4.Herencia.practica1;

public class FiguraTriangulo extends Figuras{

    private double base;
    private double altura;

    public FiguraTriangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura / 2;
    }
    public double perimetro() {
        return base * 3;
    }

    public String toString() {
        return "El triangulo es " + color + ", su area es " + area() + " y su perimetro es " + perimetro();
    }


}
