package ProgramacionTema1.Ejercicios_2;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el numero que quieras");
        int numero = scanner.nextInt();
        System.out.println("El doble de " + numero + " es " + (numero*2));
        System.out.println("Y el triple es " + (numero*3));

    }
}
