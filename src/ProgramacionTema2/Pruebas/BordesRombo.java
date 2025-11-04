package ProgramacionTema2.Pruebas;

import java.util.Scanner;


public class BordesRombo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De cuantas filas quieres el rombo?");
        int lineas = sc.nextInt();

        for (int i = 1; i <= lineas; i++) {
            for (int j = i; j < lineas; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = lineas - 1; i >= 1; i--){
            for (int j = i; j < lineas; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
