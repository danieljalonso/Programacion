package ProgramacionTema2.Ejercicios_2;

import java.util.Scanner;
import java.util.Random;

/*
Programa un juego que genere un número aleatorio y te permita
introducir números hasta que des con el adecuado. El juego deberá
indicarte si el número introducido es mayor o menor.
 */

public class Ejercicio_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int aleatorio = random.nextInt(100) + 1;
        int numero = 0;

        do {
            System.out.println("Adivina el numero entre el 1 y el 100");
            numero = sc.nextInt();
            if (aleatorio < numero) {
                System.out.println("El numero es menor");
            } else if (aleatorio > numero) {
                System.out.println("El numero es mayor");
            } else if (aleatorio == numero) {
                System.out.println("HAS ACERTADO!!!");
            }
        } while (aleatorio != numero);

    }
}
