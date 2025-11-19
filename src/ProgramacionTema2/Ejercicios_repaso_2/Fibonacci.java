package ProgramacionTema2.Ejercicios_repaso_2;

/*
Vamos a operar con Fibonacci:
a----- Crea una clase Java llamada Fibonacci, que contenga una función que devuelva
en un String los N primeros números de la serie de Fibonacci. Por ejemplo:

Se pasa 3: devolverá "1 1 2".
Se pasa 5: devolverá "1 1 2 3 5"

b----- Crea un metodo llamado pintar triángulo, que reciba un parámetro (int niveles) y,
utilizando el metodo anterior, pinte lo siguiente, por ejemplo con 6 niveles:

1
1 1
1 1 2
1 1 2 3
1 1 2 3 5
1 1 2 3 5 8
 */

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("De cuantos numeros quieres la serie de Fibonacci?");
        int veces = sc.nextInt();


        System.out.print(fibonacci(veces));

        System.out.println();

        for (int i = 0; i <= veces; i++) {
            System.out.println(pintarTriangulo(i));
        }


        sc.close();

    }

    static String fibonacci(int veces) {
        int[] serie = new int[veces];
        String fibonacci = "";

        int num1 = 1, num2 = 0, aux;

        for (int i = 0; i < veces; i++) {
            serie[i] = num1;
            aux = num1;
            num1 += num2;
            num2 = aux;
        }

        for (int n : serie) {
            fibonacci += n + " ";
        }
        return fibonacci;
    }

    static String pintarTriangulo(int veces) {
        String fila = "";
        for (int i = 1; i <= veces; i++) {
            fila = fibonacci(i) + " ";
        }

        return fila;

    }
}
