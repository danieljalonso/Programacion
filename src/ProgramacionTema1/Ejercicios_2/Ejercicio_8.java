package ProgramacionTema1.Ejercicios_2;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero de 3 cifras");
        int numero = scanner.nextInt();
        System.out.println((numero/100) + " " + (numero/10%10) + " " + (numero%10));

        scanner.close();
    }
}
