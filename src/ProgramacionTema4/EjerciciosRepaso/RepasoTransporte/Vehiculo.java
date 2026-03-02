package ProgramacionTema4.EjerciciosRepaso.RepasoTransporte;

public abstract class Vehiculo implements Transportable{

    String matricula;
    double kilometrosRecorridos;
    double combustibleRestante;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.kilometrosRecorridos = 0;
        this.combustibleRestante = 100;
    }

}
