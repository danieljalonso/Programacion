package ProgramacionTema4.Excepciones.Ejercicio_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroEntero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Dime un numero entero");
            int n = sc.nextInt();
            System.out.println("El numero es entero");
        } catch (InputMismatchException e) {
            System.out.println("El numero NO es entero");
        } finally {
            sc.close();
            System.out.println("Scanner cerrado");
        }

    }
}
