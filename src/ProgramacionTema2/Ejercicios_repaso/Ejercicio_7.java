package ProgramacionTema2.Ejercicios_repaso;

import java.util.Scanner;

//Escribe un metodo que convierta grados Celsius a Fahrenheit.

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la temperatura en grados Celsius");
        double gc = sc.nextDouble();

        System.out.println(gc + " grados Celsius son " + gf(gc) + " grados Fahrenheit");

    }
    static double gf(double gc) {
        return (gc * 9 / 5) + 32;
    }
}
