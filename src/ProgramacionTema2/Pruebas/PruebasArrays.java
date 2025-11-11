package ProgramacionTema2.Pruebas;

import java.util.Arrays;

public class PruebasArrays {
    public static void main(String[] args) {

        int[] notas = new int[3];
        notas[0] = 6;
        notas[1] = 6;
        notas[2] = 7;
        System.out.println(Arrays.toString(notas));
        int[] notasAuxiliares = notas;
        notas = new int[4];

        //Copiamos los valores
        for (int i = 0; i < notasAuxiliares.length; i++) {
            notas[i] = notasAuxiliares[i];
        }
        notas[3] = 8;

        System.out.println(Arrays.toString(notasAuxiliares));
        System.out.println(Arrays.toString(notas));

    }
}
