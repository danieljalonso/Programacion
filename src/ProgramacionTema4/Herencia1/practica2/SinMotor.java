package ProgramacionTema4.Herencia1.practica2;

public class SinMotor extends Vehiculo{

    String material;

    public SinMotor(String color, String modelo, int precio, String marca, String material) {
        super(color, modelo, precio, marca);
        this.material = material;
    }

}
