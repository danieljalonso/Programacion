package ProgramacionTema4.Herencia.practica2;

public class ConMotor extends Vehiculo{

    int cilindrada;
    String combustible;

    public ConMotor(String color, String modelo, int precio, String marca, int cilindrada, String combustible) {
        super(color, modelo, precio, marca);
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }


}
