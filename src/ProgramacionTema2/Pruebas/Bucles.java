package ProgramacionTema2.Pruebas;

import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 5; i ++) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        int numero = 1;
        while (numero < 5) {
            System.out.println(numero);
            numero++;
        }

        System.out.println("-------------------");

        int num;
        do {
            System.out.println("Introduce un numero y te doy el doble");
            num = sc.nextInt();
            System.out.println("El doble de " + num + " es " + num * 2);
        } while (num !=0);

    }



}
