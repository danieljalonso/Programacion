package ProgramacionTema2.Ejercicios_1;

import java.util.Scanner;

/*
Desarrolla un programa que lea números hasta que se den cinco ceros y escriba después la suma de los números leídos.
Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
Da como salida: 33
 */

public class Ejercicio_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int veces = 0;
        int suma = 0;

        while (veces < 5) {
            System.out.println("Escribe un numero");
            int sigNum = sc.nextInt();
            suma += sigNum;
            if (sigNum == 0) {
                veces ++;
            }
        }
        System.out.println("El resultado es: " + suma);

    }
}
