package ProgramacionTema4.EjerciciosRepaso.EmpresaTransporte;

public class Burro implements Transportable {

    private String nombre;
    private double energiaRestante;
    private double carga;

    public Burro(String nombre, double energiaRestante, double carga) {
        this.nombre = nombre;
        this.energiaRestante = energiaRestante;
        this.carga = carga;
    }

    public void descansar() {
        this.energiaRestante = 100;
    }

    @Override
    public void viajar(double distancia) {
        double consumo = distancia * 3;
        energiaRestante -= consumo;
    }
}
