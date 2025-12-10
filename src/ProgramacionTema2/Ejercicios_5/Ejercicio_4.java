package ProgramacionTema2.Ejercicios_5;

/*
Desarrolla un programa que rote una cadena tantas veces como se le indique.

Introduciendo: “Lunes”

Rotaciones: 3

Da como salida: “nesLu”
 */

public class Ejercicio_4 {
    public static void main(String[] args) {

        String texto = "federico";
        int veces = 3;

        String textoRotado = "";
        textoRotado += texto.substring(texto.length() - veces);
        textoRotado += texto.substring(0, texto.length() - veces);

        System.out.println(textoRotado);

    }
}
