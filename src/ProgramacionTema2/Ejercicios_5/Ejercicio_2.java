package ProgramacionTema2.Ejercicios_5;

/*
Desarrolla un programa que reciba una cadena y diga cuántas palabras contiene.
(Las palabras pueden estar separadas por espacios, puntos o comas).

Introduciendo: “Hola a todos. Adios”

Da como salida: 4
 */

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase");
        String frase = sc.nextLine();

        int contador = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == '.') {
                contador++;
                i++;
            } else if (frase.charAt(i) == ',') {
                contador++;
                i++;
            } else if (frase.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " palabras");

    }
}
