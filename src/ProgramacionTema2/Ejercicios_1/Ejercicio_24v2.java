package ProgramacionTema2.Ejercicios_1;

import java.util.Scanner;

//Pedir un número entre 0 y 9.999, decir si es capicúa.

public class Ejercicio_24v2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entre el 0 y el 9.999");
        int numero = sc.nextInt();

        int cifra0 = (numero/1000);
        int cifra1 = (numero/100%10);
        int cifra2 = (numero/10%10);
        int cifra3 = (numero%10);

        String es = "El numero " + numero + " es capicúa";
        String noEs = "El numero " + numero + " no es capicúa";

        if (numero >= 0 && numero <= 9999) {
            if (cifra0 != 0) {
                if (cifra0 == cifra3) {
                    if (cifra1 == cifra2) {
                        System.out.println(es);
                    }
                } else {
                    System.out.println(noEs);
                }
            }
            else if (cifra1 != 0) {
                if (cifra1 == cifra3) {
                    System.out.println(es);
                } else {
                    System.out.println(noEs);
                }
            }
            else if (cifra2 != 0) {
                if (cifra2 == cifra3) {
                    System.out.println(es);
                }  else {
                    System.out.println(noEs);
                }
            } else {
                System.out.println(noEs);
            }
        } else {
            System.out.println("El numero no es valido");
        }
        sc.close();
    }
}
