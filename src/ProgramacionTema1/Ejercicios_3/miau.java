package ProgramacionTema1.Ejercicios_3;
import java.util.Scanner;

public class miau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero para saber su tabla de multiplicar");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
