package ProgramacionTema4.EjerciciosRepaso.EmpresaTransporte;

public class Autobus extends Vehiculo {

    private int pasajerosActuales;
    private int capacidadMaxima;

    public Autobus(double kilometrosRecorridos, double combustibleRestante, int pasajerosActuales, int capacidadMaxima) {
        super(kilometrosRecorridos, combustibleRestante);
        this.pasajerosActuales = pasajerosActuales;
        this.capacidadMaxima = capacidadMaxima;
    }

    public Autobus(String matricula, double kilometrosRecorridos, double combustibleRestante, int pasajerosActuales, int capacidadMaxima) {
        super(matricula, kilometrosRecorridos, combustibleRestante);
        this.pasajerosActuales = pasajerosActuales;
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public void viajar(double distancia) {

    }
}
