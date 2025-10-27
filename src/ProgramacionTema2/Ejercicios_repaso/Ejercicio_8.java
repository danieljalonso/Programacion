package ProgramacionTema2.Ejercicios_repaso;

import java.util.Scanner;

//Define un metodo que retorne el valor absoluto de un número entero.

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("dime un numero entero para que se convierta en absoluto");
        int entero = sc.nextInt();

        System.out.println("El numero absoluto de " + entero + " es: " + absoluto(entero));

    }
    static int absoluto(int entero) {
        if (entero >= 0) {
            return entero;
        } else {
            return entero - entero - entero;
        }
    }
}
