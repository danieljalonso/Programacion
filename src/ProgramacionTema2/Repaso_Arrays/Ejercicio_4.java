package ProgramacionTema2.Repaso_Arrays;

import java.util.Arrays;

public class Ejercicio_4 {
    public static void main(String[] args) {

        int[] numeros = {7, 4, 9};
        numeros[1] = 6;
        System.out.println(Arrays.toString(numeros));

        int[] aux = numeros;
        numeros = new int[5];

        for (int i = 0; i < aux.length; i++) {
            numeros[i] = aux[i];
        }

        System.out.println(Arrays.toString(numeros));

    }
}
