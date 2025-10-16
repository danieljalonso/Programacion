package ProgramacionTema1.Ejercicios_3;
import java.util.Scanner;
/*
Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
 */

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una letra");
        String letra = scanner.nextLine();
        char caracter = letra.charAt(0);
        System.out.println((caracter >= 65 && caracter <= 90) ? caracter + " es mayuscula" : caracter + "es minuscula");

    }
}
