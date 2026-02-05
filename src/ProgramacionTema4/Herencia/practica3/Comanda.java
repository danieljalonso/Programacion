package ProgramacionTema4.Herencia.practica3;

import java.util.Arrays;

public class Comanda {

    int numMesa;
    int numComensales;
    Plato[] platos;

    public Comanda(int numMesa, int numComensales, Plato[] platos) {
        this.numMesa = numMesa;
        this.numComensales = numComensales;
        this.platos = platos;
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
        String plato = "";
        for (Plato p : platos) {
            plato += p + "\n -------------------------------------------------------- \n";
        }
        return plato;
    }

}
