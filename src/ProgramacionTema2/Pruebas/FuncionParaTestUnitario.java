package ProgramacionTema2.Pruebas;

import java.util.Scanner;

/*
Entre 18 y 25, +10%
Mas de 60, +15%
Con accidentes, +30%
Tipo terceros, +10%
Tipo todo riesgo, +20%
Mas de 5 años de seguro, -5%
Mas de 10 años de coche, +10%
Color oscuro +5%
Color claro -5%
 */

public class FuncionParaTestUnitario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int precio = 500;

        System.out.println("Cuantos años tienes?");
        int edad = sc.nextInt();
        System.out.println("Has tenido accidentes? true/false");
        boolean accidente = sc.nextBoolean();
        System.out.println("Que tipo de seguro tienes? terceros/todo riesgo");
        String tipo = sc.next();
        System.out.println("Cuantos años llevas con el seguro?");
        int antiguedad = sc.nextInt();
        System.out.println("Cuantos años tiene el coche?");
        int edadCoche = sc.nextInt();
        System.out.println("El color del coche es claro u oscuro?");
        String color = sc.next();

        sc.close();

        double precioFinal = calcularSeguro(precio, edad, accidente, tipo, antiguedad, edadCoche, color);
        System.out.println("El precio de tu seguro es de: " + precioFinal);

    }

    static double calcularSeguro(int precio, int edad, boolean accidente, String tipo, int antiguedad, int edadCoche, String color) {
        double anyadidos = 0;

        if (edad < 18) {
            return -1;
        }

        if (accidente) {
            anyadidos += 30;
        }
        if (tipo.equals("terceros")) {
            anyadidos += 10;
        } else {
            anyadidos += 20;
        }
        if (antiguedad > 5) {
            anyadidos -= 5;
        }
        if (edadCoche > 10) {
            anyadidos += 10;
        }
        if (color.equals("claro")) {
            anyadidos -= 5;
        } else {
            anyadidos += 5;
        }
        if (edad >= 18 && edad <= 25) {
            anyadidos += 10;
        } else if (edad >= 60) {
            anyadidos +=15;
        }
        return (anyadidos / 100 * precio) + precio;

    }
}
