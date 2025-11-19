package ProgramacionTema2.Ejercicios_repaso_2;

/*
Matrices! Crea un programa que tenga varias funciones:

A --------- Un main, donde se solicitará al usuario las dimensiones de la matriz.
B --------- Generar una matriz aleatoria. Esta función recibirá un entero (la dimensión) y devolverá la matriz (int[][]).
C --------- Generar la matriz traspuesta, en esta matriz se intercambian las dimensiones.

Ejemplo:

Matriz original:

12 45 23
67 89 10

Matriz transpuesta:

12 67
45 89
23 10
 */

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Dime cuantas filas quieres");
        int nF = sc.nextInt();
        System.out.println("Dime cuantas columnas quieres");
        int nC = sc.nextInt();

        int[][] matriz = new int[nF][nC];
        int[][] matrizT = new int[nC][nF];

        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                matriz[i][j] = r.nextInt(100);
            }
        }

        System.out.println("MATRIZ NORMAL ::");
        for (int[] num : matriz) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println();
        System.out.println("MATRIZ TRASPUESTA ::");

        for (int i = 0; i < nF; i++) {
            for (int j = 0; j < nC; j++) {
                matrizT[j][i] = matriz[i][j];
            }
        }

        for (int[] num : matrizT) {
            System.out.println(Arrays.toString(num));
        }

    }
}
