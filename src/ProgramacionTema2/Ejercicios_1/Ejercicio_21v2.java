package ProgramacionTema2.Ejercicios_1;

import java.util.Scanner;

public class Ejercicio_21v2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int sigNum = 0;

        System.out.println("Cuantos numeros vas a introducir?");
        int veces = sc.nextInt();

        for (int i = 1; i <= veces; i++) {
            System.out.println("Escribe un numero");
            sigNum = sc.nextInt();
            suma += sigNum;
        }
        System.out.println("La media es: " + suma / veces);
        sc.close();
    }
}
