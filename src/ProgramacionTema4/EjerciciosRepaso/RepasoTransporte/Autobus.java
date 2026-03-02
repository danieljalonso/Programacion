package ProgramacionTema4.EjerciciosRepaso.RepasoTransporte;

public class Autobus extends Vehiculo {

    int pasajerosActuales;
    int capacidadMaxima;

    public Autobus(String matricula, int pasajerosActuales) throws Exception {
        super(matricula);
        this.capacidadMaxima = 50;
        this.pasajerosActuales = validarPasajeros(pasajerosActuales);
    }

    // Además tiene un consumo de 0.08 litros/km + 0.005 litros por pasajero.
    @Override
    public void viajar(double distancia) throws Exception {
            double combustible = (distancia * 0.08) + (pasajerosActuales * 0.005);
            if (combustible <= combustibleRestante) {
                combustibleRestante -= combustible;
                kilometrosRecorridos += distancia;
                System.out.println("Viajando");
            } else {
                throw new Exception("Jodete, haber llenado el deposito ratón");
            }
    }

    private int validarPasajeros(int p) throws Exception {
        if (p > capacidadMaxima) {
            throw new Exception("No puedes llevar tantos pasajeros");
        }
        return p;
    }

}
