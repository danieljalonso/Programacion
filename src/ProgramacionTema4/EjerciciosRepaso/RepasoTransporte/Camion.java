package ProgramacionTema4.EjerciciosRepaso.RepasoTransporte;

public class Camion extends Vehiculo {

    int cargaActual;
    int capacidadMaxima;

    public Camion(String matricula, int cargaActual) throws Exception {
        super(matricula);
        this.capacidadMaxima = 5000;
        this.cargaActual = validarCarga(cargaActual);
    }


    // Además tiene un consumo de 0.1 litros/km + 0.01 litros por cada 1000 kg.
    @Override
    public void viajar(double distancia) throws Exception {
        double combustible = (distancia * 0.1) + (cargaActual/1000 * 0.01);
        if (combustible <= this.combustibleRestante) {
            combustibleRestante -= combustible;
            kilometrosRecorridos += distancia;
            System.out.println("Viajando");
        } else {
            throw new Exception("Jodete, haber llenado el deposito ratón");
        }
    }

    private int validarCarga(int c) throws Exception {
        if (c > capacidadMaxima) {
            throw new Exception("No puedes llevar tanta carga");
        }
        return c;
    }

}
