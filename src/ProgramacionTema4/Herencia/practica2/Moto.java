package ProgramacionTema4.Herencia.practica2;

public class Moto extends ConMotor{

    String tipo;

    public Moto(String color, String modelo, int precio, String marca, int cilindradas, String combustible, String tipo) {
        super(color, modelo, precio, marca, cilindradas, combustible);
        this.tipo = tipo;
    }

}
