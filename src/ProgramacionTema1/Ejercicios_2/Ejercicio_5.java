package ProgramacionTema1.Ejercicios_2;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu direccion");
        String direccion = scanner.nextLine();
        System.out.println("Escribe tu numero de telefono");
        int numero = scanner.nextInt();
        System.out.println("Tu direccion es " + direccion + "\n" + "Y tu numero de telefono es " + numero);

    }
}
