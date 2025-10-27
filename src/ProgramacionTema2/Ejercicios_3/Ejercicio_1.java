package ProgramacionTema2.Ejercicios_3;

import java.util.Scanner;

//Implementa un metodo recursivo que determine si un número es primo.

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero");
        int num = sc.nextInt();

        if (esPrimo(num, 2)) {
            System.out.println("es primo");
        } else {
            System.out.println("no es primo");
        }

    }

    static boolean esPrimo(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor * divisor > num) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return esPrimo(num, divisor + 1);
    }
}
