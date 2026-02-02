package ProgramacionTema4.Herencia1.practica2;

public class Bicicleta extends SinMotor{

    int numMarchas;

    public Bicicleta(String color, String modelo, int precio, String marca, String material, int numMarchas) {
        super(color, modelo, precio, marca, material);
        this.numMarchas = numMarchas;
    }

}
