package ProgramacionTema4.EjerciciosRepaso.RepasoTransporte;

public class Burro implements Transportable {

    String nombre;
    int energiaRestante;
    double carga;

    public Burro(String nombre, double carga) {
        this.nombre = nombre;
        this.carga = carga;
        this.energiaRestante = 100;
    }

    // Consumo: 3 unidades de energía por km.
    @Override
    public void viajar(double distancia) throws Exception {
        double energia = distancia * 3;
        if (energia <= energiaRestante) {
            energiaRestante -= energia;
            System.out.println("Viajando");
        } else {
            throw new Exception("Pobre burro, dejale descansar");
        }
    }

    // Tendrá un metodo para descansar que restaura la energía a 100.
    public void descansar() {
        energiaRestante = 100;
    }

}
