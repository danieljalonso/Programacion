package ProgramacionTema2.Pruebas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysOrdenadoONo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(5) + 1;
        }
        System.out.println(Arrays.toString(numeros));

        String ordenado = comprobarSiEstaOrdenado(numeros);

        System.out.println("El array " + ordenado + " está ordenado");

    }
    static String comprobarSiEstaOrdenado(int[] numeros) {
        int num1 = numeros[0];
        int num2;
        boolean ordenado = true;

        for (int i = 1; i < numeros.length; i++) {
            num2 = numeros[i];

            if (num1 >= num2) {
                ordenado = false;
            }
            num1 = num2;
        }

        if (ordenado) {
            return "sí";
        } else {
            return "no";
        }
    }

}
