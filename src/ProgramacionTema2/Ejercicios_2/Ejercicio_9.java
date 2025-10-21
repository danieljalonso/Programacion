package ProgramacionTema2.Ejercicios_2;

import java.util.Scanner;

//Mostrar los N primeros términos de la serie de Fibonacci. N se definirá como una variable.

public class Ejercicio_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos numeros de la serie de Fibonacci quieres que se muestren por pantalla?");
        int cantidad = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print(num1 + (i < cantidad ? ", " : ""));
            int sig = num1 + num2;
            num1 = num2;
            num2 = sig;
        }

    }
}
