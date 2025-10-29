package ProgramacionTema2.Pruebas;

import java.util.Scanner;

/*
base: 500€
entre 18 y 25 = +20%
entre 35 y 55 y sin accidentes= -10%
mayor de 65 = +10%
mayor de 65 y accidentes = +30%
 */

public class SeguroCoche {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int precioInicial = 500;
        int edad;
        String siNo;
        boolean accidentes = false;
        double precioFinal;

        System.out.println("Cuantos años tienes?");
        edad = sc.nextInt();

        do {
            System.out.println("Has tenido accidentes? si/no");
            siNo = sc.next();
            if (siNo.equals("si")) {
                accidentes = true;
            } else if (siNo.equals("no")) {
                accidentes = false;
            } else {
                System.out.println("No has introducido 'si' o 'no'");
            }
        } while (!siNo.equals("si") && !siNo.equals("no"));
        sc.close();

        precioFinal = calcularPrecioSeguro(precioInicial, edad, accidentes);
        System.out.println("Tienes que pagar " + precioFinal + "€ por tu seguro");

    }

    private static double calcularPrecioSeguro(int precioInicial, int edad, boolean accidentes) {

        if (edad >= 18 && edad <= 25) {
            return precioInicial * 1.20d;
        } else if (edad >= 35 && edad <= 55 && !accidentes) {
            return precioInicial * 0.90d;
        } else if (edad >= 65 && !accidentes) {
            return precioInicial * 1.10d;
        } else {
            return precioInicial * 1.30d;
        }

    }
}
