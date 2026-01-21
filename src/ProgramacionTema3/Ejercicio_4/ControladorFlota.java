package ProgramacionTema3.Ejercicio_4;

import java.util.Scanner;

public class ControladorFlota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        NaveEspacial[] naves = new NaveEspacial[3];

        for (int i = 0; i < naves.length; i++) {
            System.out.println("Introduce el nombre de la nave numero " + (i + 1));
            String n = sc.next();
            System.out.println("Introduce la capacidad de carga de la nave numero " + (i + 1));
            double c = sc.nextDouble();

            naves[i] = new NaveEspacial(n, c);
        }

        naves[0].viajar(30);
        naves[1].viajar(60);

        for (NaveEspacial n : naves) {
            n.mostrarEstado();
        }

        naves[0].repostar();
        naves[0].mostrarEstado();

        int c1 = naves[0].getCombustible();
        int c2 = naves[1].getCombustible();
        int c3 = naves[2].getCombustible();

        int mayor;

        if (c1 >= c2 && c1 >= c3) mayor = 0;
        else if (c2 >= c1 && c2 >= c3) mayor = 1;
        else mayor = 2;

        System.out.println("La nave con mas combustible es:");
        naves[mayor].mostrarEstado();

    }
}
