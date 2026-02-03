package ProgramacionTema4.Herencia.practica3;

import java.util.Arrays;

public class Comanda {

    int numMesa;
    int numComensales;
    Plato[] platos;

    public Comanda(int numMesa, int numComensales, int cantidad) {
        this.numMesa = numMesa;
        this.numComensales = numComensales;
        this.platos = new Plato[cantidad];
    }

    public double coste() {
        double costeTotal = 0;
        for (Plato p : platos) {
            costeTotal += p.getPrecio();
        }
        return costeTotal;
    }

    public boolean hayDiabeticosEnLaMesa() {
        for (Plato p : platos) {
            if (p instanceof PlatoPostre) {
                if (!((PlatoPostre) p).getconAzucar()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return Arrays.toString(platos);
    }

}
