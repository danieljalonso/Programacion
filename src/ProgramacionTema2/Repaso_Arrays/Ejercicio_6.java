package ProgramacionTema2.Repaso_Arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_6 {
    public static void main(String[] args) {

        Random r = new Random();

        int[][] notas = new int[2][3];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = r.nextInt(11);
            }
        }

        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
        }

        for (int[] n : notas) {
            System.out.println(Arrays.toString(n));
        }

        System.out.println("suma: " + suma);

    }
}
