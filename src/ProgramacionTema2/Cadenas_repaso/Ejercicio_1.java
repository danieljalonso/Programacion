package ProgramacionTema2.Cadenas_repaso;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una palabra");
        String palabra = sc.next();

        System.out.println("Su longitud es: " + palabra.length());
        System.out.println("Su primer caracter es: " + palabra.charAt(0));
        System.out.println("Su ultimo caracter es: " + palabra.charAt(palabra.length() - 1));
        System.out.println("Contiene la 'a'? " + (palabra.contains("a") ? "si" : "no"));

    }
}
