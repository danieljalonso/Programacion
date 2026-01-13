package ProgramacionTema1.Ejercicios_2;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una velocidad en km/h (escribe solo el numero)");
        int velocidad = scanner.nextInt();
        double nuevaVelocidad = velocidad / 3.6;
        System.out.println(velocidad + " km/h serian: " + nuevaVelocidad + " empty/s");
        System.out.printf("%d km/h serian: %.2f empty/s", velocidad, nuevaVelocidad);
        scanner.close();
    }
}
