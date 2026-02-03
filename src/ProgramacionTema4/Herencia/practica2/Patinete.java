package ProgramacionTema4.Herencia.practica2;

public class Patinete extends SinMotor{

    int numRuedas;

    public Patinete(String color, String modelo, int precio, String marca, String material, int numRuedas) {
        super(color, modelo, precio, marca, material);
        this.numRuedas = numRuedas;
    }

}
