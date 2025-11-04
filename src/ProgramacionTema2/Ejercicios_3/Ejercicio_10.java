package ProgramacionTema2.Ejercicios_3;

import java.util.Scanner;

/*
Haz un programa que ordene alfabéticamente las letras de una frase.
El programa debe pedir por teclado una frase y escribirla con las letras ordenadas.
Ejemplo: Tecleando la palabra “hola”.
Escribirá “ahlo”.
El trabajo de ordenar la frase lo realizará un metodo llamado ordenar() al que se le pasará
la frase y la retornará ordenada. Este metodo realizará el trabajo de la siguiente manera:
Repetir tantas veces como letras tenga la frase.
{
Obtener la letra menor
Añadir esa letra al resultado
Eliminar la letra de la frase original
}
El proceso de obtener la letra menor lo realizará un metodo llamado
obtenerLetraMenor() al que se le pasa la frase y nos da la letra mas pequeña.
Asimismo el trabajo de eliminar la letra de la frase original lo realizará otro
metodo llamado eliminarLetra() al que se le pasa la frase y la letra a eliminar
y nos da como resultado la frase modificada.
 */

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = sc.nextLine();

        String ordenado = ordenar(frase);

        System.out.println("Tu palabra ordenada alfabéticamente es: " + ordenado);

    }

    static String ordenar(String frase) {
        String ordenado = "";
        while (frase.length() > 0) {
            char letraMenor = obtenerLetraMenor(frase);
            ordenado += letraMenor;
            frase = eliminarLetra(frase, letraMenor);
        }
        return ordenado;

    }

    static char obtenerLetraMenor(String frase) {
        char menor = frase.charAt(0);
        for (int i = 1; i < frase.length(); i++) {
            if (frase.charAt(i) < menor) {
                menor = frase.charAt(i);
            }
        }
        return menor;

    }

    static String eliminarLetra(String frase, char letraMenor) {
        int posicion = frase.indexOf(letraMenor);
        return frase.substring(0, posicion) + frase.substring(posicion + 1);

    }
}
