package ProgramacionTema2.Ejercicios_4;

//Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro mágico
//aquel en el que las filas, las columnas y las diagonales suman igual.

public class Ejercicio_8 {
    public static void main(String[] args) {

        int sumaPropuesta = 0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;

        boolean esMagico = true;

        int[][] cuadrado = {
                {15, 8, 1, 24, 17},
                {16, 14, 7, 5, 23},
                {22, 20, 13, 6, 4},
                {3, 21, 19, 12, 10},
                {9, 2, 25, 18, 11}
        };

        for (int i = 0; i < 5; i++) {
            sumaPropuesta += cuadrado[0][i];
        }

        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += cuadrado[i][j];
            }
            if (sumaFila != sumaPropuesta) {
                esMagico = false;
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < 5; j++) {
                sumaColumna += cuadrado[j][i];
            }
            if (sumaColumna != sumaPropuesta) {
                esMagico = false;
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            sumaDiagonal1 += cuadrado[i][i];
            sumaDiagonal2 += cuadrado[i][4 - i];
        }
        if (sumaDiagonal1 != sumaPropuesta || sumaDiagonal2 != sumaPropuesta) {
            esMagico = false;
        }

        System.out.println(esMagico ? "Es un cuadrado mágico" : "No es un cuadrado mágico");

    }
}
