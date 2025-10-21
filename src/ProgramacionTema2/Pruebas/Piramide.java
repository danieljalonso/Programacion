package ProgramacionTema2.Pruebas;

import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int numVeces = sc.nextInt();


        for (int i = 1; i <= numVeces; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = numVeces - 1; i >= 1; i--) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
