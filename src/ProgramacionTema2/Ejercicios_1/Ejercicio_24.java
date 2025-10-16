package ProgramacionTema2.Ejercicios_1;

import java.util.Scanner;

//Pedir un número entre 0 y 9.999, decir si es capicúa.

public class Ejercicio_24 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero entre el 0 y el 9.999");
        int numero = sc.nextInt();

        int cifra0 = (numero/1000);
        int cifra1 = (numero/100%10);
        int cifra2 = (numero/10%10);
        int cifra3 = (numero%10);

        String es = "El numero " + numero + " es capicúa";

        if (numero >= 0 && numero <= 9999) {
            System.out.printf("%d%d%d%d \n", cifra0, cifra1, cifra2, cifra3);
            if (cifra0 == 0) {
                if (cifra1 == 0) {
                    if (cifra2 != 0) {
                        if (cifra2 == cifra3) {
                            System.out.println(es);
                        }
                    }
                }
                if (cifra1 == cifra3) {
                    System.out.println(es);
                }
            }
            if (cifra0 == cifra3) {
                if (cifra1 == cifra2) {
                    System.out.println(es);
                }
            }
        }
        else if (numero >= 0 && numero <= 9999) {
            System.out.println("El numero " + numero + " no es capicúa");

        } else {
            System.out.println("El numero no es valido");
        }
        sc.close();
    }
}
