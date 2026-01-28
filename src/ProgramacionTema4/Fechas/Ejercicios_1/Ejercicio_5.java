package ProgramacionTema4.Fechas.Ejercicios_1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas clases has tenido?");
        int clases = sc.nextInt();

        int totalMinutos = clases * 50;

        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;

        System.out.println("Duración total: " + horas + " horas y " + minutos + " minutos");

    }
}
