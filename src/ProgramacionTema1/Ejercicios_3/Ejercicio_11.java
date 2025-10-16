package ProgramacionTema1.Ejercicios_3;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el radio de la circunferencia");
        double radio = scanner.nextDouble();
        System.out.println("La longitud del perimetro es: " + (2*Math.PI*radio) + " y el area es: " + (Math.PI*radio*radio));

    }
}
