package ProgramacionTema3.Ejercicios_String;

import java.util.Random;
import java.util.Scanner;

/*
Desarrolla un programa que simule el juego del ahorcado.
Elegimos una palabra y vamos pidiendo letras al usuario.
Cada vez mostramos la palabra solo con las letras acertadas.
Si no acierta todas las letras en 8 intentos, se da el juego por perdido.
 */

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] palabras = {"palabra","mesilla","pizarra","ordenador","caravana","espada","mochila"};

        String palabraSecreta = palabras[r.nextInt(palabras.length)];
        int contadorIntentos = 0;
        int intentosMaximos = 8;
        int letrasPorAdivinar = palabraSecreta.length();

        char[] palabraParcial = new char[palabraSecreta.length()];
        for (int i = 0; i < palabraParcial.length; i++) {
            palabraParcial[i] = '-';
        }

        while (contadorIntentos < intentosMaximos && letrasPorAdivinar > 0) {

            System.out.println("Tu palabra hasta ahora es: " + new String(palabraParcial));

            System.out.println("Introduce una letra");
            String teclado = sc.next().toLowerCase();
            char letra = teclado.charAt(0);

            if (palabraSecreta.contains(String.valueOf(letra))) {
                System.out.println("La letra " + letra + " está en la palabra secreta");
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        if (palabraParcial[i] == '-') {
                            palabraParcial[i] = letra;
                            letrasPorAdivinar--;
                        }
                    }
                }
            } else System.out.println("La letra " + letra + " no está en la palabra");
            if (letrasPorAdivinar > 0) {
                contadorIntentos++;
                System.out.println("Llevas " + contadorIntentos + " intentos de " + intentosMaximos);
            } else {
                System.out.println("HAS GANADO, la palabra es: " + palabraSecreta);
            }

        }

        if (contadorIntentos >= intentosMaximos) {
            System.out.println("Vaya... Has perdido, la palabra era: " + palabraSecreta);
        }

        sc.close();
    }
}