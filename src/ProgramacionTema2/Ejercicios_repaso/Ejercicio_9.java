package ProgramacionTema2.Ejercicios_repaso;

import java.util.Scanner;

/*
Crea un metodo llamado operacion que reciba dos números y un código de operación
(1 para suma, 2 para resta, 3 para multiplicación, 4 para división).
Según el código, el metodo debe realizar la operación indicada y mostrar el resultado.
 */

public class Ejercicio_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escribe el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Qué operacion quieres hacer? \n Sumar: 1 \n Restar: 2 \n Multiplicar: 3 \n Dividir: 4");
        int operacion = sc.nextInt();

        operacion(num1, num2, operacion);

    }

    static void operacion(int num1, int num2, int operacion) {
        switch (operacion) {
            case 1:
                System.out.println("El resultado de la operacion es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la operacion es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la operacion es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("El resultado de la operacion es: " + (num1 / num2));
                break;
            default:
                System.out.println("Numero de operacion no valido");
        }
    }
}
