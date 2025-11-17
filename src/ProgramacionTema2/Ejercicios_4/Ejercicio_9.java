package ProgramacionTema2.Ejercicios_4;

//Crea un programa que mezcle dos arrays ordenados de N elementos, consiguiendo otro array de N*2 elementos igualmente ordenados.

import java.util.Arrays;

public class Ejercicio_9 {
    static void main() {

        int[] array1 = {4, 8, 25, 22, 25, 40};
        int[] array2 = {3, 6, 18, 21, 25, 47};

        int[] resultado = new int[array1.length + array2.length];

        int i = 0; // indice array1
        int j = 0; // indice array2
        int k = 0; // indice resultado

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                resultado[k] = array1[i];
                i++;
            } else {
                resultado[k] = array2[j];
                j++;
            }
            k++;
        }

        while (i < array1.length) {
            resultado[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            resultado[k] = array2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(resultado));

    }
}
