package ProgramacionTema1.Ejercicios_3;
import java.util.Scanner;

/*
Realiza un programa que calcule cuántos billetes hay que darle a un cliente
que quiera sacar cierta cantidad de dinero de su banco.
Siempre calcularemos la mínima cantidad de billetes
 */

public class Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba la cantidad de dinero que quiere sacar de su cuenta");
        int dinero = scanner.nextInt();
        int resto = dinero;

        int b500 = dinero / 500;
        resto = dinero - 500 * b500;
        int b200 = resto / 200;
        resto = resto - 200 * b200;
        int b100 = resto / 100;
        resto = resto - 100 * b100;
        int b50 = resto / 50;
        resto = resto - 50 * b50;
        int b20 = resto / 20;
        resto = resto - 20 * b20;
        int b10 = resto / 10;
        resto = resto - 10 * b10;
        int b5 = resto / 5;
        resto = resto - 5 * b5;


        System.out.println("Usted quiere sacar " + dinero + "€" + ", le vamos a dar:  \n" + b500 + " billete/s de 500 \n"
        + b200 + " billete/s de 200 \n" + b100 + " billete/s de 100 \n" + b50 + " billete/s de 50 \n" + b20 + " billete/s de 20 \n"
        + b10 + " billete/s de 10 \n" + b5 + " billete/s de 5 \n");

        System.out.println(resto == 0 ? " " : "le ha sobrado " + resto + "€ que no podemos darle por el tamaño de billetes");

    }
}
