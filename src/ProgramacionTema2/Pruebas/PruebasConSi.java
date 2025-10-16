package ProgramacionTema2.Pruebas;

import java.util.Scanner;

public class PruebasConSi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        /*

         */

        if (edad >= 18) {
            if (edad >= 65) {
                System.out.println("Tienes edad para jubilarte");
            } else {
                System.out.println("Eres mayor de edad");
            }
        } else {
            System.out.println("Eres menor de edad");
        }

    }
}
