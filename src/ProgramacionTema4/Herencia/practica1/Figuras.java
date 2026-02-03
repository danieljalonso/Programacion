package ProgramacionTema4.Herencia.practica1;

public class Figuras {

    String color;

    public Figuras(String color) {
        this.color = color;
    }
    public Figuras() {
        this("negro");
    }

    public String toString() {
        return color;
    }

}
