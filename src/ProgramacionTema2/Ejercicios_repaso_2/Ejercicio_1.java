package ProgramacionTema2.Ejercicios_repaso_2;

/*
Dado que es navidad, escribe un programa que, introducido un número por teclado,
dibuje la siguiente figura, por ejemplo, con el 5 tendrá 5 alturas:

         *
        ***
       *****
      *******
     *********
         |
El tronco tiene un palo de tronco por cada 5 niveles.
 */

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De cuantas filas quieres el arbol?");
        int lineas = sc.nextInt();

        // Hojas
        for (int i = 1; i <= lineas; i++) {
            for (int j = i; j < lineas; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((i * 2) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Tronco
        for (int i = 1; i <= lineas / 2; i++) {
            for (int j = 1; j < lineas; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        sc.close();

    }
}
