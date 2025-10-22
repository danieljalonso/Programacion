package ProgramacionTema2.Pruebas;

//Implementa un metodo que reciba un nombre y edad y muestre un mensaje personalizado.

import java.util.Scanner;

public class NombreYEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = sc.nextLine();

        System.out.println("Y tu edad?");
        int edad = sc.nextInt();

        sc.close();

        mensaje(nombre, edad);

    }
    static void mensaje(String nombre, int edad) {
        System.out.printf("Hola %s!! Tienes %d años", nombre, edad);
    }
}
