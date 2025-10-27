package ProgramacionTema2.Ejercicios_repaso;

import java.util.Scanner;

//Implementa un metodo que calcule el mayor entre tres números.

public class Ejercicio_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Dime el tercer numero");
        int num3 = sc.nextInt();

        System.out.println("El mayor de los 3 es: " + numeroMayor(num1, num2, num3));

    }
    static int numeroMayor(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
