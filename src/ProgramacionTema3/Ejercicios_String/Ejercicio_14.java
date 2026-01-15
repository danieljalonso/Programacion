package ProgramacionTema3.Ejercicios_String;

/*
Implementa un programa que intercale las letras de dos palabras.
El programa debe pedir 2 palabras y luego dar otra palabra resultado
con las letras de las dos palabras intercaladas.

Introduciendo:

Primera palabra “INTERNET”
Segunda palabra “correo”

Da como salida: “IcNoTrErReNoET”
 */

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la primera palabra");
        String palabra1 = sc.next();
        System.out.println("Dime la segunda palabra");
        String palabra2 = sc.next();

        char[] p1 = new char[palabra1.length()];
        char[] p2 = new char[palabra2.length()];

        for (int i = 0; i < p1.length; i++) {
            p1[i] = palabra1.charAt(i);
        }
        for (int i = 0; i < p2.length; i++) {
            p2[i] = palabra2.charAt(i);
        }

        String intercalo = "";

        if (p1.length < p2.length) {
            for (int i = 0; i < p1.length; i++) {
                intercalo += "" + p1[i] + p2[i];
            }
            intercalo += palabra2.substring(palabra1.length());
        } else {
            for (int i = 0; i < p2.length; i++) {
                intercalo += "" + p2[i] + p1[i];
            }
            intercalo += palabra1.substring(palabra2.length());
        }

        System.out.println(intercalo);

    }
}
