package ProgramacionTema2.Ejercicios_4;

/*
Dado un array de 50 números entre 1 y 100, aleatorios, escribir una lista ordenada con los valores que no aparecen en el array.
 */

import java.util.Arrays;
import java.util.Random;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Random r = new Random();

        int[] numeros = new int[50];
        int[] noEstan = new int[0];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(numeros));

        for (int i = 1; i <= 100; i++) {
            boolean esta = false;

            for (int j = 0; j < numeros.length; j++) {
                if (i == numeros[j]) {
                    esta = true;
                }
            }

            if (!esta) {
                int[] aux = new int[noEstan.length + 1];

                for (int k = 0; k < noEstan.length; k++) {
                    aux[k] = noEstan[k];
                }

                aux[aux.length - 1] = i;
                noEstan = aux;
            }
        }

        System.out.println(Arrays.toString(noEstan));

    }
}
