package ProgramacionTema2.Ejercicios_1;

import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero");
        int num = sc.nextInt();
        double div;
        for (int i = num; i >= 0; i--) {
            div = i % 2;
            if (div != 0) {
                System.out.println(i);
            }
        }

    }
}
