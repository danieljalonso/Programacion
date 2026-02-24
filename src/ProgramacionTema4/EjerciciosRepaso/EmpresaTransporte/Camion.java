package ProgramacionTema4.EjerciciosRepaso.EmpresaTransporte;

public class Camion extends Vehiculo {

    private double cargaActual;
    private double capacidadMaxima;

    public Camion(String matricula, double kilometrosRecorridos, double combustibleRestante, double cargaActual) {
        super(matricula, kilometrosRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }

    public Camion(double kilometrosRecorridos, double combustibleRestante, double cargaActual) {
        super(kilometrosRecorridos, combustibleRestante);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }

    @Override
    public void viajar(double distancia) {
        double consumo = 0.1 * distancia;
        consumo += 0.01 * cargaActual;
        combustibleRestante -= consumo;
    }
}
