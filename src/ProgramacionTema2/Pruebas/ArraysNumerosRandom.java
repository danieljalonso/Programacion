package ProgramacionTema2.Pruebas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysNumerosRandom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] numeros = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(numeros));

        System.out.println("Que número quieres comprobar? Del 1 al 10");
        int encontrar = sc.nextInt();

        int veces = encontrarNumero(numeros, encontrar);

        String vezVeces = vezOVeces(veces);

        System.out.println("El número " + encontrar + " está " + veces + vezVeces);

    }

    static int encontrarNumero(int[] numeros, int encontrar) {
        int veces = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == encontrar) {
                veces++;
            }
        }
        return veces;
    }

    static String vezOVeces(int veces) {
        if (veces == 1) {
            return " vez";
        } else {
            return " veces";
        }
    }

}
