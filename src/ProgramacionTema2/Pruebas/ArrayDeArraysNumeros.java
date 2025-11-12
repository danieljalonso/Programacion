package ProgramacionTema2.Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeArraysNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Escribe el número de la posición " + i + " y " + j);
                numeros[i][j] = sc.nextInt();
            }
        }

        for (int[] arrayDeNumeros : numeros) {
            System.out.println(Arrays.toString(arrayDeNumeros));
        }

        sc.close();
    }
}
