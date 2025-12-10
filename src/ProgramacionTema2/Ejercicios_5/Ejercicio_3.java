package ProgramacionTema2.Ejercicios_5;

/*
Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.

Introduciendo: “Lunes”

Da como salida: “Mvoft”
 */

public class Ejercicio_3 {
    public static void main(String[] args) {

        String texto = "Lunes";
        String textoCambiado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                textoCambiado += (char) ('a' + (c - 'a' + 1) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                textoCambiado += (char) ('A' + (c - 'A' + 1) % 26);
            } else {
                textoCambiado += c;
            }
        }

        System.out.println(textoCambiado);

    }
}
