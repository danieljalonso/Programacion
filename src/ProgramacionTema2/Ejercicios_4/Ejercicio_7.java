package ProgramacionTema2.Ejercicios_4;

/*
Dado un array de 3x3 elementos, calcular la suma de sus filas y
sus columnas almacenándolas en dos array de 3 elementos.
 */

import java.util.Arrays;

public class Ejercicio_7 {
    public static void main(String[] args) {

        int[][] tabla = {
                {4, 10, 32},
                {6, 25, 67},
                {76, 3, 12}
        };

        int[] filas = new int[3];
        int[] columnas = new int[3];

        for (int i = 0; i < filas.length; i++) {
            for (int j = 0; j < filas.length; j++) {
                filas[i] += tabla[i][j];
            }
        }
        for (int i = 0; i < columnas.length; i++) {
            for (int j = 0; j < columnas.length; j++) {
                columnas[i] += tabla[j][i];
            }
        }

        for (int[] num : tabla) {
            System.out.println(Arrays.toString(num));
        }
        System.out.println();
        System.out.println("Filas: " + Arrays.toString(filas));
        System.out.println("Columnas: " + Arrays.toString(columnas));

    }
}
