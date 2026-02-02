package ProgramacionTema4.Herencia1.practica2;

public class Coche extends ConMotor{

    int numPuertas;

    public Coche(String color, String modelo, int precio, String marca, int cilindradas, String combustible, int numMPuertas) {
        super(color, modelo, precio, marca, cilindradas, combustible);
        this.numPuertas = numMPuertas;
    }

}
