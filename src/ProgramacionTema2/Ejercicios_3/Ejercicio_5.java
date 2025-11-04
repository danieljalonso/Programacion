package ProgramacionTema2.Ejercicios_3;

import java.util.Scanner;

/*
Metodo factorial(), que calculará el factorial del número que se le pasa como parámetro.
Retornará el resultado del cálculo del factorial, o bien un -1 en caso de que el parámetro pasado sea negativo,
y un -2 en caso de que el parámetro pasado sea cero.
 */

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero");
        int numero = sc.nextInt();

        int numFactorial = factorial(numero);
        System.out.println("El resultado es: " + numFactorial);

    }
    static int factorial(int numero) {
        if (numero == 0) {
            return -2;
        }
        if (numero < 0) {
            return -1;
        }
        if (numero == 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }
}
